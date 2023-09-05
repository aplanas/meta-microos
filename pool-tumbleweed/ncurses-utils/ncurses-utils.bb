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

PV = "6.4.20230819"

RPM_NAME = "ncurses-utils-6.4.20230819-19.1.aarch64.rpm"
RPM_HASH = "da6ccc99fcfb52cea403b70d48d32e2c5f2105f24f72829ea69c6c8dc3f5c4f3ee1d40f31ea75abddb7c8d33846920a31bb06c9f15dad54e061b21d6d1c51c6e"

RPROVIDES:${PN} += "ncurses-/usr/bin/tput \
ncurses-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libticw.so.6 \
libtinfo.so.6"

inherit rpm
