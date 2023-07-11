SUMMARY = "A m17n plugin for mlterm"
DESCRIPTION = "A plugin to use the m17n input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-m17n-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "37dd58c191e44a189ae3002e221da43fbe0583a1404e5b5b54021997ac65a20f1e3d877d0b82186debb89c1f760dae437501d1419a36982180bb8d4bdb082e1f"

RPROVIDES:${PN} += "libim-m17nlib-sdl2.so \
libim-m17nlib-wl.so \
libim-m17nlib.so \
locale-m17n-ja;ko;zh;ar;he \
mlterm-m17n"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm17n-core.so.0 \
libm17n.so.0 \
libpobl.so.2"

inherit rpm
