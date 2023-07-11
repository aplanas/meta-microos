SUMMARY = "API documentation for munge-maven-plugin"
DESCRIPTION = "This package provides API documentation for munge-maven-plugin."
LICENSE = "CDDL-1.0"

PV = "1.0"

RPM_NAME = "munge-maven-plugin-javadoc-1.0-2.11.noarch.rpm"
RPM_HASH = "1d790bea5e1eda23d3ed0d2c902212a20172f9a0f82d73bed6b9b43181d95dfb6295a8c5d2966f3c7ca55c775169ba61eafa985f993ce9ce7c0f537afe7e51d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "munge-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
