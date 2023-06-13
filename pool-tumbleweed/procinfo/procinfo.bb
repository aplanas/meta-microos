SUMMARY = "Tool to Display System Status Gathered from /proc"
DESCRIPTION = "The 'procinfo' command gathers some system data from the /proc \
directory and prints it nicely formatted on the standard output device."
LICENSE = "GPL-2.0-or-later"

PV = "18"

RPM_NAME = "procinfo-18-225.11.aarch64.rpm"
RPM_HASH = "1d798961f0a180de34d8177040733e403f93e5ca9425f52c6015ed58108a423392c6b0ffe141e5f8e8fba5d55f90370b55f19efa174b49823523cf0ee87b47cc"

RPROVIDES:${PN} += "procinfo \
procinfo(aarch-64) \
ps:/usr/bin/lsdev"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
