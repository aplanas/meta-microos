SUMMARY = "Interactive Tool for Browsing C Source Code"
DESCRIPTION = "Cscope is an interactive, screen-oriented tool that allows the user to \
browse through C source code files for specified elements of code."
LICENSE = "BSD-3-Clause"

PV = "15.9"

RPM_NAME = "cscope-15.9-1.13.aarch64.rpm"
RPM_HASH = "15a25834bc4a0f63c4280fb015f3e0503c3bac17d160a234430cd963491732e4395a63b2f96354908dcede587621dfbb8d808cef776ef7141106d132e5060761"

RPROVIDES:${PN} += "cscope \
cscope(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
