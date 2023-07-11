SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo basic database, maintained in the ncurses package. \
This database is the official successor to the 4.4BSD termcap file and \
contains information about any known terminal. The ncurses library \
makes use of this database to use terminals correctly."
LICENSE = "MIT"

PV = "6.4.20230617"

RPM_NAME = "terminfo-base-6.4.20230617-15.1.aarch64.rpm"
RPM_HASH = "e248b499c11776b4b51f67752ac982524e2bd48f7864065be8b1a465c2d98e2925a25344782d4981775c21c427197714a3b4c2d2b6121c7d2c0299b34e7c6404"

RPROVIDES:${PN} += "config-terminfo-base \
ncurses-/usr/share/tabset \
terminfo-base"

RDEPENDS:${PN} += "ncurses"

inherit rpm
