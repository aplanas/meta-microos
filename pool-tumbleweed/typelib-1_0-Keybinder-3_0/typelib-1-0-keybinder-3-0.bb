SUMMARY = "Introspection bindings for Keybinder"
DESCRIPTION = "Library for registering global keyboard shortcuts. Keybinder \
works with GTK-based applications using the X Window System. \
 \
This package provides the GObject Introspection bindings for libkeybinder0."
LICENSE = "MIT & X11"

PV = "0.3.2"

RPM_NAME = "typelib-1_0-Keybinder-3_0-0.3.2-1.25.aarch64.rpm"
RPM_HASH = "3521461a179344b9588b97d4f88b85dc25dfcc0ab769d6a42c5ed5601302990f0d6d9262ada61724242ee64f355b14cfa2c8dc5aa96144678087e81eebb650e5"

RPROVIDES:${PN} += "typelib(Keybinder) \
typelib-1_0-Keybinder-3_0 \
typelib-1_0-Keybinder-3_0(aarch-64)"

RDEPENDS:${PN} += "libkeybinder-3.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
