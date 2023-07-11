SUMMARY = "PolicyKit Authorization Framework -- Introspection bindings"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes. \
 \
This package provides the GObject Introspection bindings for PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "typelib-1_0-Polkit-1_0-121-4.3.aarch64.rpm"
RPM_HASH = "bea13da05ab35f61d13ab9c299df7b1632c5b8ce6f405fd8d00b13de04e3c163a58884c6fdb51e1a563b063147e94ea76fc01a7e0e1014f4ce822c55fa28bbd4"

RPROVIDES:${PN} += "typelib-1-0-Polkit-1-0 \
typelib-Polkit \
typelib-PolkitAgent"

RDEPENDS:${PN} += "libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
