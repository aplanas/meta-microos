SUMMARY = "Introspection bindings for libfprint"
DESCRIPTION = "This package contains the introspection bindings for the libfprint."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "typelib-1_0-FPrint-2_0-1.94.5+tod1-1.4.aarch64.rpm"
RPM_HASH = "adbe2b13ec66ebd29a7b804c0dfa25921ebc52d743f8ca2cc58e579561ea26a31dfaf60d033a42620c2a597a2f7284f71fdf8050254406850e8cd81fb71a64a7"

RPROVIDES:${PN} += "typelib-1-0-FPrint-2-0 \
typelib-FPrint"

RDEPENDS:${PN} += "libfprint-2.so.2 \
typelib-GLib \
typelib-GObject \
typelib-GUsb \
typelib-Gio"

inherit rpm
