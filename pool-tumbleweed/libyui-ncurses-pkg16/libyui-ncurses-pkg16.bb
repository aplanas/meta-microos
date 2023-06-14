SUMMARY = "Libyui - yast2 package selector widget for the NCurses UI"
DESCRIPTION = "This package contains the NCurses (text based) package selector \
component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-ncurses-pkg16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "d9d8940e13ba0bd93eea9c13387df726dcb5da6179321c36fc817e5ba0ccfeadcf36055b1ffd53a1a99c6afbc0a925f4aee817a169cc62185ac1ae943428a974"

RPROVIDES:${PN} += "libyui-ncurses-pkg \
libyui-ncurses-pkg.so.16 \
libyui-ncurses-pkg16 \
libyui-pkg \
yast2-ncurses-pkg"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libyui-ncurses16 \
libyui.so.16 \
libyui16 \
libzypp \
libzypp.so.1722"

inherit rpm
