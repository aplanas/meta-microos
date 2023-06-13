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

RPROVIDES:${PN} += "ncurses-utils \
ncurses-utils(aarch-64) \
ncurses:/usr/bin/tput"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libticw.so.6()(64bit) \
libticw.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libticw.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libticw.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libticw.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libticw.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_6.2.20211010)(64bit)"

inherit rpm
