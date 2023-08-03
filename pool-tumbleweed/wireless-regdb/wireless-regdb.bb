SUMMARY = "802.11 regulatory domain database"
DESCRIPTION = "The 802.11 regulatory domain database is used by CRDA and provides allowed \
frequency ranges for 802.11 wireless drivers."
LICENSE = "ISC"

PV = "20230721"

RPM_NAME = "wireless-regdb-20230721-1.1.noarch.rpm"
RPM_HASH = "7070cbbc30912d822effe4486948e31bfd20771f641e6f02f30bf8623095c777632afb7991846354edc2f6d3418a72f0f853ec44f89af678da76bb4adee53e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-regulatory.db \
firmware-regulatory.db.p7s \
wireless-regdb"

RDEPENDS:${PN} += ""

inherit rpm
