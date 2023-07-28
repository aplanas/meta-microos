SUMMARY = "Ibus plugin for mlterm"
DESCRIPTION = "A plugin to use the ibus input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-ibus-3.9.3-2.1.aarch64.rpm"
RPM_HASH = "a55e479e36849717ff4c1e0f3fe72370c67f5cd48e1732a3a8bb36949b72d059ee392dabcc31c1616a05ff00005c42bebb9cd0a465a235e30ba0d98909139f00"

RPROVIDES:${PN} += "libim-ibus-sdl2.so \
libim-ibus-wl.so \
libim-ibus.so \
locale-scim-ja;ko;ar;he \
mlterm-ibus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libpobl.so.2"

inherit rpm
