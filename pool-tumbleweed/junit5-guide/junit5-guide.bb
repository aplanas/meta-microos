SUMMARY = "Documentation for junit5"
DESCRIPTION = "JUnit 5 User Guide."
LICENSE = "EPL-2.0"

PV = "5.8.2"

RPM_NAME = "junit5-guide-5.8.2-1.9.noarch.rpm"
RPM_HASH = "69949b8d0920ef3710a37e03d1d17956b083d97184bf655a52734082f04bf3df3db230931f62e9e89e28b228f4ef200e67f8883226f24864a996988cd946a145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5-guide"

RDEPENDS:${PN} += "junit5-javadoc"

inherit rpm
