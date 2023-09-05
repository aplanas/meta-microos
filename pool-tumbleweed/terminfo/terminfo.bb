SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo reference database, maintained in the ncurses \
package. This database is the official successor to the 4.4BSD termcap \
file and contains information about any known terminal. The ncurses \
library makes use of this database to use terminals correctly. If you \
just use the Linux console, xterm, and VT100, you probably will not \
need this database -- a minimal /usr/share/terminfo tree for these \
terminals is already included in the terminfo-base package."
LICENSE = "SUSE-Public-Domain"

PV = "6.4.20230819"

RPM_NAME = "terminfo-6.4.20230819-19.1.aarch64.rpm"
RPM_HASH = "ddc27fe12f984971b074ea27493f815a6432b2ee9dce3ed0f21d1f64f23c575aec3e95392f4accf2c43640dcef4f814d2e1073c1549d7545480506173f7b12dd"

RPROVIDES:${PN} += "terminfo"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
