SUMMARY = "Introspection bindings for AppStream"
DESCRIPTION = "GObject introspection bindings for interfaces provided by AppStream."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "typelib-1_0-AppStream-1.0-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "812b3d1be5cf58ac17908a5a0a562568466aa2430facf11c026b32b7817c3ece1eaf4c60ed8683aa55895e35d44263b5dc932488381bd92fd0bb4387d006b143"

RPROVIDES:${PN} += "typelib-1-0-AppStream-1.0 \
typelib-AppStream"

RDEPENDS:${PN} += "libappstream.so.4 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
