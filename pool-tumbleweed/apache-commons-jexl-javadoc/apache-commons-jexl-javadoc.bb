SUMMARY = "Javadocs for apache-commons-jexl"
DESCRIPTION = "This package contains the API documentation for apache-commons-jexl."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "apache-commons-jexl-javadoc-2.1.1-2.6.noarch.rpm"
RPM_HASH = "45d2bf3b7ef59911cc44597f6a2d03993c30914a5c024cd6de560a3e5b9c1f39deaef0558e7fff5e66bb65c07ac623a8ddc6467340f4d6b38bdef74063c13dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-jexl-javadoc \
commons-jexl-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
