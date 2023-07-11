SUMMARY = "API documentation for felix-utils"
DESCRIPTION = "This package contains the API documentation for felix-utils."
LICENSE = "Apache-2.0"

PV = "1.11.4"

RPM_NAME = "felix-utils-javadoc-1.11.4-1.13.noarch.rpm"
RPM_HASH = "c4b83767f6d75f2ec836067330f2793a6211677fb71454973ee277f7b6c1097225f3da282716046029105bbb8a5447a541cb39abdd12a6fade985a54102c3b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-utils-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
