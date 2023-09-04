SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo reference database, maintained in the ncurses \
package. This database is the official successor to the 4.4BSD termcap \
file and contains information about any known terminal. The ncurses \
library makes use of this database to use terminals correctly. If you \
just use the Linux console, xterm, and VT100, you probably will not \
need this database -- a minimal /usr/share/terminfo tree for these \
terminals is already included in the terminfo-base package."
LICENSE = "SUSE-Public-Domain"

PV = "6.4.20230812"

RPM_NAME = "terminfo-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "91351138bcb051af2c152ab1aada1093ca7955f9dcb7006fd53b3d7d89c186e39a0a04eb5ed57889ff7ed2ebe5f91f5b55f450155dd0a3c4af2971e5c020b317"

RPROVIDES:${PN} += "terminfo"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
