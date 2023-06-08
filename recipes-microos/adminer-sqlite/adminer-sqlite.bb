SUMMARY = "Dependencies required for Adminer SQLite support"
DESCRIPTION = "Virtual package that requires dependencies needed for Adminer SQLite support"
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-sqlite-4.8.1-1.6.noarch.rpm"
RPM_HASH = "83ebbf53fe54ab124eefae6fa0ba158fcb38473c49452c0934c0aee5db9677390ac69534f0e423b22220d09d7d59209a6e5e2fbfd1f1cbf08738c9df2557a3aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer-database-support adminer-sqlite"
RDEPENDS:${PN} += "adminer php-sqlite"

inherit rpm
