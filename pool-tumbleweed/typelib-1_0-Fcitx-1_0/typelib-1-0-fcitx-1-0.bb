SUMMARY = "The Flexible Context-aware Input Tool with eXtension -- Introspection bindings"
DESCRIPTION = "Fcitx is a CJK input method framework. It supports Table, \
Pinyin and QuWei input methods. It's flexible and fast. \
 \
This package provides the GObject Introspection bindings for Fcitx."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "typelib-1_0-Fcitx-1_0-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "78b15f675b2dc7846b24599b58061325556b7a5119a8a13d4df8d64020b08101c63107a7165c31c520a1bb7e7182b08159e9a14779e0328cda08144f65e14bcd"

RPROVIDES:${PN} += "typelib-1-0-Fcitx-1-0 \
typelib-Fcitx"

RDEPENDS:${PN} += "libfcitx-gclient.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
