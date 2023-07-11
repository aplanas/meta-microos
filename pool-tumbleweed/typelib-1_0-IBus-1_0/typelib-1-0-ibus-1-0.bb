SUMMARY = "Introspection bindings for IBus"
DESCRIPTION = "This package contains the introspection bindings for the IBus library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "typelib-1_0-IBus-1_0-1.5.28-2.2.aarch64.rpm"
RPM_HASH = "c848bf5d9f785650ca2e4ccc93891ab5996f3eb93abe685f99f9c48024dd3c4c0d07151909ba1ec0d27b6ef8b9f5cbb29e9d965e1030dfcedf522d473ee84bfd"

RPROVIDES:${PN} += "typelib-1-0-IBus-1-0 \
typelib-IBus"

RDEPENDS:${PN} += "libibus-1.0.so.5 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
