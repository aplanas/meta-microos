SUMMARY = "PDF parsing and creation library"
DESCRIPTION = "A cross platform PDF parsing and creation library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libpodofo0_9_8-0.9.8-1.11.aarch64.rpm"
RPM_HASH = "314626924b2c6324654ddc2de47cdafb4862d14d01f0a6b0700b9abab3306d8fddac4f957c2d83f4aed810df7a66b6238bce8a96fab3a85311f96bf10170fbe5"

RPROVIDES:${PN} += "libpodofo.so.0.9.8 \
libpodofo0-9-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
