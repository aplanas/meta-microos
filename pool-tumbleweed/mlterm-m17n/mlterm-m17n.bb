SUMMARY = "A m17n plugin for mlterm"
DESCRIPTION = "A plugin to use the m17n input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-m17n-3.9.3-2.1.aarch64.rpm"
RPM_HASH = "3a95bf671b5edfa111ed02b572b9e49997e1bf5cd893def0c650d074585b6d55a76c0d389ee4ea32d338377849793d16689dffd893474780121c1b6a711aba69"

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
