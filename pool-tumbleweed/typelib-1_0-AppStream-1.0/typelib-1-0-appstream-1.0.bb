SUMMARY = "Introspection bindings for AppStream"
DESCRIPTION = "GObject introspection bindings for interfaces provided by AppStream."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.2"

RPM_NAME = "typelib-1_0-AppStream-1.0-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "ec400031c95d8ec3e0fd768276dde7638655e864193d7a885e16f9d1575e7b6c63b159c33084dd431f767ff61fff1cce9f7d49b399a712c2bb1f73efff1a6223"

RPROVIDES:${PN} += "typelib-1-0-AppStream-1.0 \
typelib-AppStream"

RDEPENDS:${PN} += "libappstream.so.4 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
