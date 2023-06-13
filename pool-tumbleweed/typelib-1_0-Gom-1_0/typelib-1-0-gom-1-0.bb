SUMMARY = "Introspection bindings for the GObject Data Mapper"
DESCRIPTION = "This is a DataMapper for GObject. \
 \
This package provides the GObject Introspection bindings for gom."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "typelib-1_0-Gom-1_0-0.4-1.15.aarch64.rpm"
RPM_HASH = "c758913c1e9f679abfdd756662dd6cf219e28e7d70b98c8107da6e5d6100b0037803b3cb92472a1e8e5e1b76bd002df24e93701f45808caef3b84a4ce2d007e2"

RPROVIDES:${PN} += "typelib(Gom) \
typelib-1_0-Gom-1_0 \
typelib-1_0-Gom-1_0(aarch-64)"

RDEPENDS:${PN} += "libgom-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
