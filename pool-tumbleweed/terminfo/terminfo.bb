SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo reference database, maintained in the ncurses \
package. This database is the official successor to the 4.4BSD termcap \
file and contains information about any known terminal. The ncurses \
library makes use of this database to use terminals correctly. If you \
just use the Linux console, xterm, and VT100, you probably will not \
need this database -- a minimal /usr/share/terminfo tree for these \
terminals is already included in the terminfo-base package."
LICENSE = "SUSE-Public-Domain"

PV = "6.4.20230617"

RPM_NAME = "terminfo-6.4.20230617-15.1.aarch64.rpm"
RPM_HASH = "7508553414ce7c851110a46b8942b79b3e857832d8b3e45bc0b7f4056352e2a713654f185739ebb9eebacf754b036330f245fe7fd3de1be1cb209dda69eab180"

RPROVIDES:${PN} += "terminfo"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
