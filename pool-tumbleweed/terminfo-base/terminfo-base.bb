SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo basic database, maintained in the ncurses package. \
This database is the official successor to the 4.4BSD termcap file and \
contains information about any known terminal. The ncurses library \
makes use of this database to use terminals correctly."
LICENSE = "MIT"

PV = "6.4.20230819"

RPM_NAME = "terminfo-base-6.4.20230819-19.1.aarch64.rpm"
RPM_HASH = "f5c268f5d49eb8f3f7e6995ff459d281e847024bd8eb00f102bfe27462a634c5332c2faf79e697d8e0b445a6aca9fb27a248f9324657eadcb5f92f940b91217a"

RPROVIDES:${PN} += "config-terminfo-base \
ncurses-/usr/share/tabset \
terminfo-base"

RDEPENDS:${PN} += "ncurses"

inherit rpm
