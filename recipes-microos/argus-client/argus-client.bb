SUMMARY = "Client for Network Monitoring Tool"
DESCRIPTION = "Client for Argus network monitoring tool."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8.2"

RPM_NAME = "argus-client-3.0.8.2-3.15.aarch64.rpm"
RPM_HASH = "0ff1aea9aade680f5baa459bde18226910581e18091c9345f04e65eb7626aecbf704587245d3851714946cd6ec7b59caf2fb7c9a2b4334a36d8ac69f4c2e95d2"

RPROVIDES:${PN} += "argus-client argus-client(aarch-64) config(argus-client)"
RDEPENDS:${PN} += "/usr/bin/perl argus ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libreadline.so.8()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libwrap.so.0()(64bit)"

inherit rpm
