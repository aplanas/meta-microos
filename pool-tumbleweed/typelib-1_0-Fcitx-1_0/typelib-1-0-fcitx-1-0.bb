SUMMARY = "The Flexible Context-aware Input Tool with eXtension -- Introspection bindings"
DESCRIPTION = "Fcitx is a CJK input method framework. It supports Table, \
Pinyin and QuWei input methods. It's flexible and fast. \
 \
This package provides the GObject Introspection bindings for Fcitx."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "typelib-1_0-Fcitx-1_0-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "8f3c1bc35d3bd09da0fc36c3087909c65b718c9f3069e626fe1c37ec51f79259afa8fd1196064a9d93d021291fa1bd985e3c0b1f4383697b5b56fc68d33c357b"

RPROVIDES:${PN} += "typelib-1-0-Fcitx-1-0 \
typelib-Fcitx"

RDEPENDS:${PN} += "libfcitx-gclient.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
