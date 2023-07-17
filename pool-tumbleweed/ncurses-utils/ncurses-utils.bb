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

PV = "6.4.20230701"

RPM_NAME = "ncurses-utils-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "d51cf31311dd388af7eb02ce9940a180461d798f79aee17f829b7e482e944ae79d9fd27e0b72ffab79e3dc052cc4e62500f7939b6fb6dc37d85794334f26b56b"

RPROVIDES:${PN} += "ncurses-/usr/bin/tput \
ncurses-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libticw.so.6 \
libtinfo.so.6"

inherit rpm
