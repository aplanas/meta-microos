SUMMARY = "Introspection bindings for libskk, a Japanese IME"
DESCRIPTION = "SKK is a statistical language model based Japanese input method engine. \
to model the Japanese language, it use a backoff bigram and trigram \
 \
This package provides the introspection bindings for the libskk library."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0+git20171110+1.0.3"

RPM_NAME = "typelib-1_0-Skk-1_0-1.2.0+git20171110+1.0.3-2.8.aarch64.rpm"
RPM_HASH = "9c733dfab72991d6d0256f86971a500a98decc9b76d796ab948ae7c935a51b659c30286d12299b1ca0d8626f65f3cce9abfad3dab0ba5cfe2a1b9a43ef47abc0"

RPROVIDES:${PN} += "typelib(Skk) \
typelib-1_0-Skk-1_0 \
typelib-1_0-Skk-1_0(aarch-64)"

RDEPENDS:${PN} += "girepository-1_0 \
libskk.so.0()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
