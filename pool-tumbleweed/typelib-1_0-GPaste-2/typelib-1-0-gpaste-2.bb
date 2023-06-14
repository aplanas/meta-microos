SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "typelib-1_0-GPaste-2-43.2+6-2.1.aarch64.rpm"
RPM_HASH = "0eca74103eeb83cf94bec81ea764d88b6473677e7df5665ea58f28b24f53aa0f9de54095644b3685b264850680db6a52dbcd52bf3add41b8710e3fde1d970b6a"

RPROVIDES:${PN} += "typelib-1-0-GPaste-2 \
typelib-GPaste"

RDEPENDS:${PN} += "libgpaste-2.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
