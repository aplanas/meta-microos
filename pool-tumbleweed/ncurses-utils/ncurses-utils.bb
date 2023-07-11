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

PV = "6.4.20230617"

RPM_NAME = "ncurses-utils-6.4.20230617-15.1.aarch64.rpm"
RPM_HASH = "ca77bf3882ead6cf4c0799a626e1e75c920cc27bd913b48ca2b71212e4b12e40673e9a43124d6950a1c776cca04656cb6a5337b3b8f016b766baae179a48a5a5"

RPROVIDES:${PN} += "ncurses-/usr/bin/tput \
ncurses-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libticw.so.6 \
libtinfo.so.6"

inherit rpm
