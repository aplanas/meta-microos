SUMMARY = "Japanese Kana to Kana-Kanji converter -- Introspection bindings"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
 \
This package provides the GObject Introspection bindings for libkkc."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20200818.e33e7fb"

RPM_NAME = "typelib-1_0-kkc-1_0-0.3.6~git20200818.e33e7fb-1.18.aarch64.rpm"
RPM_HASH = "0a6180e196c1b49930329d6b2a740d0e7481017aa13ccf6117dc49293fdc11c9d18a79f5c510d50b34853f54ab0839ea640aa1fda98f8f6c4f1afc6a81da2bea"

RPROVIDES:${PN} += "typelib-1-0-kkc-1-0 \
typelib-Kkc"

RDEPENDS:${PN} += "libkkc.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gee \
typelib-Gio \
typelib-Json"

inherit rpm
