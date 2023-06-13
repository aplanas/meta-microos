SUMMARY = "The GNOME Desktop Menu -- Introspection bindings"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org \
 \
This package provides the GObject Introspection bindings for the \
libgnome-menu library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.0"

RPM_NAME = "typelib-1_0-GMenu-3_0-3.36.0-3.3.aarch64.rpm"
RPM_HASH = "f50c25d2f655fcd000d68fd66be44b1058fab22a546238df376d637fbd1383d21daa437fc09eb1019e4ab73e27f12366e4f075bb28a2d196c7ab02cc8bc36d21"

RPROVIDES:${PN} += "typelib(GMenu) \
typelib-1_0-GMenu-3_0 \
typelib-1_0-GMenu-3_0(aarch-64)"

RDEPENDS:${PN} += "libgnome-menu-3.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
