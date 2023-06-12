SUMMARY = "The GNOME Desktop Menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
http://www.freedesktop.org/Standards/menu-spec"
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "libgnome-menu-3-0-3.36.0-3.3.aarch64.rpm"
RPM_HASH = "1deaca44f15a062a55a86ba9c547939f0d8b04893fb24284971d40c473c3b6766b12da18a1e4557f9c626b22173335add07762d8cbca9624ef57d151b17e1fd7"

RPROVIDES:${PN} += "libgnome-menu-3-0 \
libgnome-menu-3-0(aarch-64) \
libgnome-menu-3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
gnome-menus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
