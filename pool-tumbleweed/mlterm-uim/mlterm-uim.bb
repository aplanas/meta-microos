SUMMARY = "An uim plugin for mlterm"
DESCRIPTION = "A plugin to use the uim input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-uim-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "4f7c7b970987b75fe4945a914db54e5a5ab5eae4205ce085114369c7bc50c56b877bd7a590acbc671fd2fa360977c0547f4ac0ed3bd4f78ea3bd56375e926c76"

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
