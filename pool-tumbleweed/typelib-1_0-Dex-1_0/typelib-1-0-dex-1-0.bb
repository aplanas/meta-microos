SUMMARY = "Introspection bindings for libdex"
DESCRIPTION = "This package contains the introspection bindings for libdex."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "typelib-1_0-Dex-1_0-0.2.0-1.1.aarch64.rpm"
RPM_HASH = "27be8aa2d678028560f0e3272f65ce6725a435b41b983aaf955a028bd5d7af7ed95a34e340b3b5e8e5b22883e9df3fa60b5214a00c581f374b16c01f4e42a6d4"

RPROVIDES:${PN} += "typelib-1-0-Dex-1-0 \
typelib-Dex"

RDEPENDS:${PN} += "typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
