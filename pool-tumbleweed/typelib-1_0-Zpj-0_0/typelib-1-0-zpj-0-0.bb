SUMMARY = "Library for the SkyDrive and Hotmail REST APIs -- Introspection bindings"
DESCRIPTION = "libzapojit is a GLib/GObject wrapper for the SkyDrive and Hotmail \
REST APIs. \
 \
This package provides the introspection bindings for libzapojit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.3"

RPM_NAME = "typelib-1_0-Zpj-0_0-0.0.3-8.4.aarch64.rpm"
RPM_HASH = "9882943fef614aaeed7fbcd05df1e383c6c524a249848c5f372d2d604753c2b71ca93bf644c83f8331ddb254caf5e55dfa20261876e22420fb4afb1141638db4"

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
