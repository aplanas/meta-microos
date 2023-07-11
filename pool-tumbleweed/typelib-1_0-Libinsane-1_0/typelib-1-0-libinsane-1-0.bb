SUMMARY = "Introspection bindings for libinsane"
DESCRIPTION = "This package provides the GObject Introspection bindings for the \
libinsane library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "typelib-1_0-Libinsane-1_0-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "23d4d4fac1a03b08a2ee471ae41becb89e6b01271d77d6d9cd549427771bca8bb79ee6cffa05c6282bd370cc2f7ef872af2a6345a59db694e177d0e0279c2a30"

RPROVIDES:${PN} += "typelib-1-0-Libinsane-1-0 \
typelib-Libinsane"

RDEPENDS:${PN} += "libinsane-gobject.so.1 \
typelib-GLib \
typelib-GObject"

inherit rpm
