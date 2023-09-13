SUMMARY = "802.11 regulatory domain database"
DESCRIPTION = "The 802.11 regulatory domain database is used by CRDA and provides allowed \
frequency ranges for 802.11 wireless drivers."
LICENSE = "ISC"

PV = "20230901"

RPM_NAME = "wireless-regdb-20230901-1.1.noarch.rpm"
RPM_HASH = "1ef8272b9c2a2f37e0d5024d7f9816556eba6ef99d719a76eb9915465e80bd52d56732a4fd9301fa05d1f9de0cfdabb319ad1702635f10c0aa7ac8b68babe3d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-regulatory.db \
firmware-regulatory.db.p7s \
wireless-regdb"

RDEPENDS:${PN} += ""

inherit rpm
