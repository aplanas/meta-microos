SUMMARY = "Application indicators library"
DESCRIPTION = "A library to allow applications to export a menu into the Unity Menu bar. Based \
on KSNI it also works in KDE and will fallback to generic Systray support if \
none of those are available."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "libappindicator3-1-12.10.1~bzr20200706.298-2.3.aarch64.rpm"
RPM_HASH = "07679aeaf551e01a3112e41d75781af1338d277aa94190f74af5068977ba75ea3599c557ff4e47fb8741da9c803958627c10d1d8d932a38b932871712b81fbf2"

RPROVIDES:${PN} += "libappindicator-gtk3 \
libappindicator3-1 \
libappindicator3-1(aarch-64) \
libappindicator3.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbusmenu-glib.so.4()(64bit) \
libdbusmenu-gtk3.so.4()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
