SUMMARY = "MIME Parser and Utility Library -- Introspection bindings"
DESCRIPTION = "GMime is a C/C++ library for parsing and creating messages using \
the Multipurpose Internet Mail Extension (MIME)."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.13"

RPM_NAME = "typelib-1_0-GMime-3_0-3.2.13-1.1.aarch64.rpm"
RPM_HASH = "b3f5d20470958a3baf4bb2afed9e8a1527706ea1f2be8703068edb2eb9fa2f0b7383ce5fd69c62e668a5930834b6db9b51e8b732a9d4cd9f83eb9ac0dfa0943c"

RPROVIDES:${PN} += "typelib-1-0-GMime-3-0 \
typelib-GMime"

RDEPENDS:${PN} += "libgmime-3.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
