SUMMARY = "Ibus plugin for mlterm"
DESCRIPTION = "A plugin to use the ibus input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.2"

RPM_NAME = "mlterm-ibus-3.9.2-3.3.aarch64.rpm"
RPM_HASH = "ce2a7c2b74eeacf265beb3caa1855d6ffb3d54aa33145206e4baa21dd339e88a0f12aca903e69a10c14441415e18e712cc3c721509e578375802c95a467967d3"

RPROVIDES:${PN} += "libim-ibus-sdl2.so()(64bit) \
libim-ibus-wl.so()(64bit) \
libim-ibus.so()(64bit) \
locale(scim:ja;ko;ar;he) \
mlterm-ibus \
mlterm-ibus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libpobl.so.2()(64bit)"

inherit rpm
