SUMMARY = "Introspection bindings for the Totem playlist parser library"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too. \
 \
This package provides the GObject Introspection bindings for the \
totem-pl-parser library."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.6"

RPM_NAME = "typelib-1_0-TotemPlParser-1_0-3.26.6-2.8.aarch64.rpm"
RPM_HASH = "b1f95e1e3b9634c2dfe96b746b326a8001572b60b94b60dc607a6883dfe4a7d6e4cbb14fe4e40c745dd405b840c6c0634b585e88f7c80bef10b2d16ba5f21b2e"

RPROVIDES:${PN} += "typelib(TotemPlParser) \
typelib-1_0-TotemPlParser-1_0 \
typelib-1_0-TotemPlParser-1_0(aarch-64)"

RDEPENDS:${PN} += "libtotem-plparser.so.18()(64bit) \
totem-pl-parser \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
