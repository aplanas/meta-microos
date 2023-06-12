SUMMARY = "Javadoc for maven-source-plugin"
DESCRIPTION = "API documentation for maven-source-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-source-plugin-javadoc-3.0.1-3.10.noarch.rpm"
RPM_HASH = "b423303c75d3936766be927f8fdf14c6de46f2b616714e46322db047bf109be4060db87f5da996313f45424fee5f1b4b57978786c59b4026d90058335fde9c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-source-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
