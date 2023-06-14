SUMMARY = "Application indicators library"
DESCRIPTION = "A library to allow applications to export a menu into the Unity Menu bar. Based \
on KSNI it also works in KDE and will fallback to generic Systray support if \
none of those are available."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "libappindicator1-12.10.1~bzr20200706.298-2.3.aarch64.rpm"
RPM_HASH = "59cc250b0c9695c516a897919a8db4a99411d5e0bb66bb0e8376584afedf0ff46d5714c6c8e159298cf6aacd9288e5c9b8337ea0a63b9e5acb0ee4037ae4cdef"

RPROVIDES:${PN} += "libappindicator \
libappindicator.so.1 \
libappindicator1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk.so.4 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
