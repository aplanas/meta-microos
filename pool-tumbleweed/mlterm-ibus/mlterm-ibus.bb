SUMMARY = "Ibus plugin for mlterm"
DESCRIPTION = "A plugin to use the ibus input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.2"

RPM_NAME = "mlterm-ibus-3.9.2-3.3.aarch64.rpm"
RPM_HASH = "ce2a7c2b74eeacf265beb3caa1855d6ffb3d54aa33145206e4baa21dd339e88a0f12aca903e69a10c14441415e18e712cc3c721509e578375802c95a467967d3"

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
