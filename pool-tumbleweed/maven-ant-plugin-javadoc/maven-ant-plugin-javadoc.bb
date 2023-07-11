SUMMARY = "Javadoc for maven-ant-plugin"
DESCRIPTION = "API documentation for maven-ant-plugin."
LICENSE = "Apache-2.0"

PV = "2.4"

RPM_NAME = "maven-ant-plugin-javadoc-2.4-3.11.noarch.rpm"
RPM_HASH = "9034c882408cd79b5e7593547dcb4dda653b07429cfcfab0dfa3224d93434d16f1e67cc448b9ef69e3548bc6d0b4bfb6f4b43f9ef43090a19a8ed653090e90eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-ant-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
