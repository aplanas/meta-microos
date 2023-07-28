SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "typelib-1_0-GPaste-2-44.1-1.1.aarch64.rpm"
RPM_HASH = "b8517f771fb87c5a0648e77d8f90220115d322e2bf41e9e0819eda9f5b8d9158c76e2328ba519fab24e4e3e95f84fd168b991aea9d5c68cef647b2ac53f4f137"

RPROVIDES:${PN} += "typelib-1-0-GPaste-2 \
typelib-GPaste"

RDEPENDS:${PN} += "libgpaste-2.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
