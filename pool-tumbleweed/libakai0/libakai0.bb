SUMMARY = "Library for accessing AKAI disk images"
DESCRIPTION = "C++ library for accessing AKAI disk images"
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "libakai0-4.3.0-1.10.aarch64.rpm"
RPM_HASH = "10151c36a331779d265f198980f682ee14f175babe42030e943552b4b073e7838eb24e0d31a63b29bc51842e768f2b2ede680c30b6522a1d83a7abfee54325fb"

RPROVIDES:${PN} += "config-libakai0 \
libakai.so.0 \
libakai0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
