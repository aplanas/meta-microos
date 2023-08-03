SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo basic database, maintained in the ncurses package. \
This database is the official successor to the 4.4BSD termcap file and \
contains information about any known terminal. The ncurses library \
makes use of this database to use terminals correctly."
LICENSE = "MIT"

PV = "6.4.20230715"

RPM_NAME = "terminfo-base-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "04b9ff948ff9d124c617ea6f0405a1547377c40b6675dd9699cf1c25ffb1a8e7856f80e76bc75a6ef1b54a47e1d8b93aa081b6c88a1317a642436742040c3dfc"

RPROVIDES:${PN} += "config-terminfo-base \
ncurses-/usr/share/tabset \
terminfo-base"

RDEPENDS:${PN} += "ncurses"

inherit rpm
