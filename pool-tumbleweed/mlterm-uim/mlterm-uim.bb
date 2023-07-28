SUMMARY = "An uim plugin for mlterm"
DESCRIPTION = "A plugin to use the uim input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-uim-3.9.3-2.1.aarch64.rpm"
RPM_HASH = "b47170488e83727eb3ff618c63b4095c171d881333decd240012b2fe0ec7cf238e7f855689bed86dff2f96f5238c35a40b57dab229fcc1862e88f3bf1165070b"

RPROVIDES:${PN} += "libim-uim-sdl2.so \
libim-uim-wl.so \
libim-uim.so \
locale-uim-ja;ko;ar;he \
mlterm-uim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpobl.so.2 \
libuim-scm.so.0 \
libuim.so.8"

inherit rpm
