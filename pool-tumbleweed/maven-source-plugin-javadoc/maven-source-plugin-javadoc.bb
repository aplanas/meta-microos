SUMMARY = "Javadoc for maven-source-plugin"
DESCRIPTION = "API documentation for maven-source-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-source-plugin-javadoc-3.0.1-3.11.noarch.rpm"
RPM_HASH = "c776950a41de752a27a205a06f2b59628027fe851740c66b604866b3d292d86cd795d298b7be4cd1fd617f905cb7fa368b6db20921d9f1871f4a408256e5bb04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-source-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
