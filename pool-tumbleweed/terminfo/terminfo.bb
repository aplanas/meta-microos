SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo reference database, maintained in the ncurses \
package. This database is the official successor to the 4.4BSD termcap \
file and contains information about any known terminal. The ncurses \
library makes use of this database to use terminals correctly. If you \
just use the Linux console, xterm, and VT100, you probably will not \
need this database -- a minimal /usr/share/terminfo tree for these \
terminals is already included in the terminfo-base package."
LICENSE = "SUSE-Public-Domain"

PV = "6.4.20230715"

RPM_NAME = "terminfo-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "fb714a82c089cd183c10b6974d94655c8289469339629e59697fb58d90d4a8b50fd64447ec8e88b67fc9f08d27f939e67980edee7a23580bf157a8c5219cebb3"

RPROVIDES:${PN} += "terminfo"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
