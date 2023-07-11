SUMMARY = "Introspection bindings for the GObject Data Mapper"
DESCRIPTION = "This is a DataMapper for GObject. \
 \
This package provides the GObject Introspection bindings for gom."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "typelib-1_0-Gom-1_0-0.4-1.16.aarch64.rpm"
RPM_HASH = "c807033dfc5b8ddc7baefaa0726376cfd024d9447c0905c8298fe12157dd800e0aceb243bf2ae0ca0740cc93262f60f5a46f0c8a73a2141b6fd2d26bdcf20639"

RPROVIDES:${PN} += "typelib-1-0-Gom-1-0 \
typelib-Gom"

RDEPENDS:${PN} += "libgom-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
