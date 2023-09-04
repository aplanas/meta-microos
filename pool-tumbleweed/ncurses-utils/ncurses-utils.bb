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

PV = "6.4.20230812"

RPM_NAME = "ncurses-utils-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "0bf4fb68049cdaf86101fd57e01858d134179236f5324402ed51bf0e8bd312d4c0d66844647311bc468c7b9960ef0966246de0aec8aaa1f912f394f23ae6e284"

RPROVIDES:${PN} += "ncurses-/usr/bin/tput \
ncurses-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libticw.so.6 \
libtinfo.so.6"

inherit rpm
