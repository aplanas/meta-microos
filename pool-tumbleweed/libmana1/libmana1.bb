SUMMARY = "MANA runtime library"
DESCRIPTION = "This package contains the mana runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libmana1-47.0-3.1.aarch64.rpm"
RPM_HASH = "a63954307772008411f40f17220e39f46111478865e7358cffecf24071450d61abc82ffaa299b4d276e49c7d7a16a8152cc2d32139683a7b03ee3d3fd7f941c7"

RPROVIDES:${PN} += "libmana.so.1 \
libmana1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
