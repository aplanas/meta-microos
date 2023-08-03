SUMMARY = "Introspection bindings for aravis"
DESCRIPTION = "This package provides the GObject Introspection bindings for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.27"

RPM_NAME = "typelib-1_0-Aravis-0.8-0.8.27-1.1.aarch64.rpm"
RPM_HASH = "e905afb12bdb8cfa808fece4b9c650cd0193ae1f232d2242b0ff1871ba3b67119929f5852a2ef681d0355d41201000554da360118adf8174d00084252bdea5a2"

RPROVIDES:${PN} += "typelib-1-0-Aravis-0.8 \
typelib-Aravis"

RDEPENDS:${PN} += "libaravis-0.8.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
