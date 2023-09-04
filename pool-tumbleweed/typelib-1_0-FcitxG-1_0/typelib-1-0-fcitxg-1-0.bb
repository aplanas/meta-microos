SUMMARY = "Introspection bindings for fcitx5"
DESCRIPTION = "This package provides the GObject Introspection bindings for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "typelib-1_0-FcitxG-1_0-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "573d449b95970c2a071566bb9f3c49c692b599f1e8bdd5e7017c7b9803e2363788f1a68b8ce7642d1a3cd86d55e77ffc84fb3b7753d176cc55b55818b95a6502"

RPROVIDES:${PN} += "typelib-1-0-Fcitx-1-0 \
typelib-1-0-FcitxG-1-0 \
typelib-FcitxG"

RDEPENDS:${PN} += "libFcitx5GClient.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
