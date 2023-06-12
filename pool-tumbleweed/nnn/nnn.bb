SUMMARY = "Terminal based file browser"
DESCRIPTION = "nnn is a fork of noice, a terminal file browser with keyboard \
shortcuts for navigation, opening files and running tasks. There is \
no config file and MIME associations are hard-coded."
LICENSE = "BSD-2-Clause"

PV = "4.8"

RPM_NAME = "nnn-4.8-1.1.aarch64.rpm"
RPM_HASH = "d89a61c737abca1e9854a1ee942cc1b91eaa658226d060c656d66fefcf7b85d582aec4b9e10932777fee8e98d0129d65ef9ed1164a67e6fa1a0940ffe2b283cf"

RPROVIDES:${PN} += "nnn \
nnn(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libreadline.so.8()(64bit) \
libreadline.so.8(READLINE_6.3)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
