SUMMARY = "Japanese Kana to Kana-Kanji converter -- Introspection bindings"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
 \
This package provides the GObject Introspection bindings for libkkc."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20200818.e33e7fb"

RPM_NAME = "typelib-1_0-kkc-1_0-0.3.6~git20200818.e33e7fb-1.17.aarch64.rpm"
RPM_HASH = "9e767fff784f6d0dfd926b06ba5fd7cf8504ad13c2d70d46463034d33afc06eb82d2254b981b0323bb34a3b3851d871cc8bbafc0d24e66b189eead64b4ac5624"

RPROVIDES:${PN} += "typelib-1-0-kkc-1-0 \
typelib-Kkc"

RDEPENDS:${PN} += "libkkc.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gee \
typelib-Gio \
typelib-Json"

inherit rpm
