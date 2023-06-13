SUMMARY = "Introspection bindings for libinsane"
DESCRIPTION = "This package provides the GObject Introspection bindings for the \
libinsane library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.9"

RPM_NAME = "typelib-1_0-Libinsane-1_0-1.0.9-1.9.aarch64.rpm"
RPM_HASH = "d5f3da9f75a2dba3b61a0b504551ec4d4fa788ceee0eda7d86055e6be07b4cf6eca8aec7bc731bd0136d26bdbb4bf6989f1368366cf5982920d6caee08a5fe8f"

RPROVIDES:${PN} += "typelib(Libinsane) \
typelib-1_0-Libinsane-1_0 \
typelib-1_0-Libinsane-1_0(aarch-64)"

RDEPENDS:${PN} += "libinsane_gobject.so.1()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
