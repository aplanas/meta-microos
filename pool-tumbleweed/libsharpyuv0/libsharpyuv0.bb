SUMMARY = "Library for sharpening YUV option in WebP"
DESCRIPTION = "Library that provides the sharpening YUV option for better WebP images."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libsharpyuv0-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "fb1b7913e2f17fa487ff0d302ac20acba5eb194b4a3d17b829c6350bd8f8fa3d8a679339c61512ca719d3de65a837881173b4440b47bb37f2e2965b89904c125"

RPROVIDES:${PN} += "libsharpyuv.so.0()(64bit) \
libsharpyuv0 \
libsharpyuv0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
