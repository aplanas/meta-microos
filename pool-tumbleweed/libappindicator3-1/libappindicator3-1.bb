SUMMARY = "Application indicators library"
DESCRIPTION = "A library to allow applications to export a menu into the Unity Menu bar. Based \
on KSNI it also works in KDE and will fallback to generic Systray support if \
none of those are available."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "libappindicator3-1-12.10.1~bzr20200706.298-2.4.aarch64.rpm"
RPM_HASH = "54fb7102fd6934f029a473b02a51f4c09fbf8c6aedba46c581201a631201bd3d9d9e0db6972604cb000f016fd5ec38d9da33f818e35f9c3da6f4c66fb126595b"

RPROVIDES:${PN} += "libappindicator-gtk3 \
libappindicator3-1 \
libappindicator3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk3.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
