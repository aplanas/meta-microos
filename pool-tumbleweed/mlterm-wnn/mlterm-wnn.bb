SUMMARY = "Wnn plugin for mlterm"
DESCRIPTION = "A plugin to use the wnn input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-wnn-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "412b492ce141c482867430af194a7da1fb37099d996edd6af09eb11c33e5b19f28f9887474db366b0549f3141f0d7c68fdcba6af1256cc847b54dec798e56616"

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
