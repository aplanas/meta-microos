SUMMARY = "Introspection bindings for fcitx5"
DESCRIPTION = "This package provides the GObject Introspection bindings for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "typelib-1_0-FcitxG-1_0-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "507cffbf9344c3f5631796145cd33b5e649a2f79f3da4b2d108bf34fb79d3aec59fccd5d5915d7a2daef7cd3ba76ba7f9dd00fd52f192dd9656c4f46fa4751d8"

RPROVIDES:${PN} += "typelib-1-0-Fcitx-1-0 \
typelib-1-0-FcitxG-1-0 \
typelib-FcitxG"

RDEPENDS:${PN} += "libFcitx5GClient.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
