SUMMARY = "Introspection bindings for the malcontent system library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "typelib-1_0-Malcontent-0-0.10.4-1.5.aarch64.rpm"
RPM_HASH = "9cb78cad054a26c21222f00408dc523e442fe1b6acb544b5a10da0ca23d428a5127d7d2b10a1c32ae1fc14ce848caf3b8d50b43cc184b17049028474c7a5602e"

RPROVIDES:${PN} += "typelib(Malcontent) \
typelib-1_0-Malcontent-0 \
typelib-1_0-Malcontent-0(aarch-64)"

RDEPENDS:${PN} += "libmalcontent-0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
