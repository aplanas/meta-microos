SUMMARY = "The GNOME Desktop Menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec"
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "libgnome-menu-3-0-3.36.0-3.4.aarch64.rpm"
RPM_HASH = "d046a46d238ef9e3460fd41bc4d926d1fc52c1b70f9299e875a1b36034b0347441f3542cc1057f19b054895500a68c98226bfc2624c95864c2abeb18e758334f"

RPROVIDES:${PN} += "libgnome-menu-3-0 \
libgnome-menu-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnome-menus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
