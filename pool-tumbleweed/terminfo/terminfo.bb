SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo reference database, maintained in the ncurses \
package. This database is the official successor to the 4.4BSD termcap \
file and contains information about any known terminal. The ncurses \
library makes use of this database to use terminals correctly. If you \
just use the Linux console, xterm, and VT100, you probably will not \
need this database -- a minimal /usr/share/terminfo tree for these \
terminals is already included in the terminfo-base package."
LICENSE = "SUSE-Public-Domain"

PV = "6.4.20230701"

RPM_NAME = "terminfo-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "46b4bc2bf04a8e95066fa12326d19e54f7b2c5375c23c519988958eae27e9037984c9f048705a3e48d1c80d8e27bb5f800e282f18fca4d3b91b0d2cdd201357f"

RPROVIDES:${PN} += "terminfo"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
