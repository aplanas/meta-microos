SUMMARY = "API documentation for log4j"
DESCRIPTION = "API documentation for log4j."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-javadoc-2.17.2-5.8.noarch.rpm"
RPM_HASH = "c5d4153e9fa95913f9ed3d2155eb5d876fb2c48673465a88ead6b31afc77ccf00f3735ee2394e5159e7e3e4924731d2539eb8d0f4e40ea29998bd007966ea8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
