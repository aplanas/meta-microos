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

PV = "6.4.20230715"

RPM_NAME = "ncurses-utils-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "ce9fc770a5bc8ed11f6d1f561265f2aac741cf32cc924c4e739588c20f0475e35a491abece8257f7fc9b2fc9f67b8c2fdb703b30a6c6c124d7c126b0c4b92e79"

RPROVIDES:${PN} += "ncurses-/usr/bin/tput \
ncurses-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libticw.so.6 \
libtinfo.so.6"

inherit rpm
