SUMMARY = "Ibus plugin for mlterm"
DESCRIPTION = "A plugin to use the ibus input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-ibus-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "6b064886dd6fd5f2926aecc609664fc0e3c379f72a0fe831f3061001f420efdb3cf8dd139cf894dd7a76be831e04e2c242e5275217f9175a3e93f298159a3d54"

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
