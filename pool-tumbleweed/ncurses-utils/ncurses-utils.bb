SUMMARY = "Tools using the new curses libraries"
DESCRIPTION = "The ncurses based utilities are as follows: \
 \
clear -- emits clear-screen for current terminal \
 \
tabs -- set tabs on a terminal \
 \
toe   -- table of entries utility \
 \
tput  -- shell-script access to terminal capabilities. \
 \
tset  -- terminal-initialization utility \
 \
reset -- terminal initialization utility"
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "ncurses-utils-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "5af0bf10ac1654a03a8d6dff0641e3a66a316d4f8b6f064af91b81037e39771b639715567dd0936c1d7341348c9fac0038f86e7cbc82fb64852a67dbf4a631ac"

RPROVIDES:${PN} += "ncurses-/usr/bin/tput \
ncurses-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libticw.so.6 \
libtinfo.so.6"

inherit rpm
