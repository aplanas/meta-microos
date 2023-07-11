SUMMARY = "Javadoc for openregex"
DESCRIPTION = "This package contains javadoc for openregex."
LICENSE = "LGPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "openregex-javadoc-1.1.1-3.14.noarch.rpm"
RPM_HASH = "0cb8e13696db04d4d47a7d1844ca27eb98b664f217b4ec55f0b13d37943c5d8c2f721d7285f87b70df0fb6421e8fe794ccbb65bc58926ec3b11e5e70abd41831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openregex-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
