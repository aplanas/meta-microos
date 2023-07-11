SUMMARY = "802.11 regulatory domain database"
DESCRIPTION = "The 802.11 regulatory domain database is used by CRDA and provides allowed \
frequency ranges for 802.11 wireless drivers."
LICENSE = "ISC"

PV = "20230601"

RPM_NAME = "wireless-regdb-20230601-1.1.noarch.rpm"
RPM_HASH = "d17c9e6520b48562801a6441fdd30c51a40b91078f3ecc50117a5eab16d1bb882fd567f0690aee1016424684252aad4b391ecf75dfe7772964338ccb50fc63f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-regulatory.db \
firmware-regulatory.db.p7s \
wireless-regdb"

RDEPENDS:${PN} += ""

inherit rpm
