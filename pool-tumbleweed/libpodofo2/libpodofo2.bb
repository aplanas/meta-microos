SUMMARY = "PDF parsing and creation library"
DESCRIPTION = "A cross platform PDF parsing and creation library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.1"

RPM_NAME = "libpodofo2-0.10.1-1.1.aarch64.rpm"
RPM_HASH = "5a5a5fc6608495cb1c8798744dc9af0b797f882a7907d95ba6e014b9c5cddfe981776ccf5e8f56d54c9679c8d2f1a6456a5730caab60d0a689d75c65f4119efe"

RPROVIDES:${PN} += "libpodofo.so.2 \
libpodofo2"

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
libxml2.so.2 \
libz.so.1"

inherit rpm
