SUMMARY = "Libyui - NCurses (text based) user interface"
DESCRIPTION = "This package contains the NCurses (text based) user interface \
component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-ncurses16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "e90a703e05ff5ae12d629cfb4214b4daa813edd5a71bb6d8084ff2769f235a1f682df0d5b7de939c87b969143a51627a9fed28ae7fc0e83b97918156c10cfdae"

RPROVIDES:${PN} += "libyui-ncurses \
libyui-ncurses.so.16 \
libyui-ncurses16 \
yast2-ncurses \
yui-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
glibc-locale-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libpanelw.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libyui.so.16 \
libyui16"

inherit rpm
