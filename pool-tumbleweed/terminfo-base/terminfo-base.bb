SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo basic database, maintained in the ncurses package. \
This database is the official successor to the 4.4BSD termcap file and \
contains information about any known terminal. The ncurses library \
makes use of this database to use terminals correctly."
LICENSE = "MIT"

PV = "6.4.20230812"

RPM_NAME = "terminfo-base-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "e4238df34bc99f39ecffb74fd565a39b299b38acdccfbd1e476990a5527e9d24ad772db082506213121979d3a50c67a1c4366f31fc89863083c8c666ed6ec16c"

RPROVIDES:${PN} += "config-terminfo-base \
ncurses-/usr/share/tabset \
terminfo-base"

RDEPENDS:${PN} += "ncurses"

inherit rpm
