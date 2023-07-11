SUMMARY = "An implementation of the GDAL data model"
DESCRIPTION = "KEALib provides an implementation of the GDAL data model."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libkea1_5-1.5.0-2.4.aarch64.rpm"
RPM_HASH = "da7b851dbb220d9660ce0625b6e94a5d753b1b2767e41e830d52c0dc187a2780d06894335d4bf8fc14c0deff730aea36a1479f554a9675a5cf957d0e537dc2c1"

RPROVIDES:${PN} += "libkea.so.1.5 \
libkea1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-cpp.so.200 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
