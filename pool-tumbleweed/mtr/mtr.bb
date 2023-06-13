SUMMARY = "Ping and Traceroute Network Diagnostic Tool"
DESCRIPTION = "Mtr is a network diagnostic tool that combines Ping and Traceroute into \
one program. This package contains the mtr version with an ncurses \
interface, in other words, the text mode version is usable in a shell \
(telnet or SSH session, for example). \
 \
Find the graphical version in the mtr-gtk package."
LICENSE = "GPL-2.0-only"

PV = "0.95"

RPM_NAME = "mtr-0.95-2.1.aarch64.rpm"
RPM_HASH = "5be1d289242b3124f0a3f010ac99e27c5c9c40f5da1c46ed35e69477d159a5641c9fa9fa220c9412d318e9ba08e192b461df13fef74fb80630cb39210175b60e"

RPROVIDES:${PN} += "mtr \
mtr(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
permissions"

inherit rpm
