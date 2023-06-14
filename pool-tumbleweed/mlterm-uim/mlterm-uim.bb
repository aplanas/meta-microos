SUMMARY = "An uim plugin for mlterm"
DESCRIPTION = "A plugin to use the uim input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.2"

RPM_NAME = "mlterm-uim-3.9.2-3.3.aarch64.rpm"
RPM_HASH = "5e9cec0cd76adecc1070bd1ef4591acc734beb2414fb5fe0c2362618e227e37d030f4a5a8daf2b387380e7d879dac440cc1408f4d726d75a20e5143ef545c50e"

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
