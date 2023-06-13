SUMMARY = "Libyui - yast2 package selector widget for the NCurses UI"
DESCRIPTION = "This package contains the NCurses (text based) package selector \
component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-ncurses-pkg16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "d9d8940e13ba0bd93eea9c13387df726dcb5da6179321c36fc817e5ba0ccfeadcf36055b1ffd53a1a99c6afbc0a925f4aee817a169cc62185ac1ae943428a974"

RPROVIDES:${PN} += "libyui-ncurses-pkg \
libyui-ncurses-pkg.so.16()(64bit) \
libyui-ncurses-pkg16 \
libyui-ncurses-pkg16(aarch-64) \
libyui_pkg \
yast2-ncurses-pkg"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libyui-ncurses16 \
libyui.so.16()(64bit) \
libyui16 \
libzypp \
libzypp.so.1722()(64bit) \
libzypp.so.1722(ZYPP_plain)(64bit)"

inherit rpm
