SUMMARY = "Wnn plugin for mlterm"
DESCRIPTION = "A plugin to use the wnn input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.2"

RPM_NAME = "mlterm-wnn-3.9.2-3.3.aarch64.rpm"
RPM_HASH = "bd2255aa491ed009f2f8fde45ff1675123d6f1cfdc7b8ba655f8f0a840a7bd840f9af2c4baa8082576addac2e45f6a9ea302ce9f4b2b014d8f12658b7ab8e575"

RPROVIDES:${PN} += "libim-wnn-sdl2.so \
libim-wnn-wl.so \
libim-wnn.so \
locale-scim-ja;ko;ar;he \
mlterm-wnn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjd.so.0 \
libmef.so.3 \
libpobl.so.2"

inherit rpm
