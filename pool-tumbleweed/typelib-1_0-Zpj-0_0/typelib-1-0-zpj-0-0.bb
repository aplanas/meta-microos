SUMMARY = "Library for the SkyDrive and Hotmail REST APIs -- Introspection bindings"
DESCRIPTION = "libzapojit is a GLib/GObject wrapper for the SkyDrive and Hotmail \
REST APIs. \
 \
This package provides the introspection bindings for libzapojit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.3"

RPM_NAME = "typelib-1_0-Zpj-0_0-0.0.3-8.3.aarch64.rpm"
RPM_HASH = "b632cf11c2d25b5f01f8138706676fb48b8a9ac5abe7a88e2b7da3ca6a5f3f7aec4791f55c7621014427c1ec81c0939450085ff6d3481dd827f5df683a78195b"

RPROVIDES:${PN} += "typelib-1-0-Zpj-0-0 \
typelib-Zpj"

RDEPENDS:${PN} += "libzapojit-0.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json \
typelib-Rest \
typelib-Soup"

inherit rpm
