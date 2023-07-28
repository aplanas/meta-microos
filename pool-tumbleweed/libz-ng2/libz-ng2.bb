SUMMARY = "Zlib replacement with SIMD optimizations"
DESCRIPTION = "zlib-ng is a zlib replacement with support for CPU intrinsics (SSSE3, \
AVX2, NEON, VSX) when available."
LICENSE = "Zlib"

PV = "2.1.3"

RPM_NAME = "libz-ng2-2.1.3-1.1.aarch64.rpm"
RPM_HASH = "cd90bb23f9df374b512a7b8d8eaac39d24cd3c7b1d1f41ccee7ae6e9cf9f24e80c98624085a5cac2cdc24d4c4ecaf65b5b22306ae1f46f090b4fa853c8d9f4a0"

RPROVIDES:${PN} += "libz-ng.so.2 \
libz-ng2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
