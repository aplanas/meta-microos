SUMMARY = "Javadoc for maven-plugin-plugin"
DESCRIPTION = "API documentation for maven-plugin-plugin."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-plugin-javadoc-3.6.0-6.1.noarch.rpm"
RPM_HASH = "0704bc4471f96ccab903646bfa41c4490b1f52e08e1ab8af6c50fbd7a402aeaed7e235d788002fda0cc595a5a7035993813e7eb19396bfe012e9b9cd41bb7e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
