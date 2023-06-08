SUMMARY = "An AV1 decoder"
DESCRIPTION = "dav1d is a SIMD-enhanced decoder for AV1 video. It features \
 \
 * Accelerated assembly using x86 AVX2. \
 * Partial acceleration using x86 SSSE3 and ARM NEON. \
 * Support for bitdepths 8, 10 and 12. \
 * Support for chroma subsamplings 4:2:0, 4:2:2, 4:4:4 and grayscale. \
 \
AV1 is a royalty-free video codec by the Alliance for Open Media. It \
has the potential to be up to 20% better than the HEVC codec."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "dav1d-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "0b4c3fd8ef4cba0d8a7beb3affb5263c38ec1bd4997d9bd5069db7317eabba254f348f9c8cf24567dfc0f53f7740df515917388e6ea387a9440ace079cb315ab"

RPROVIDES:${PN} += "dav1d dav1d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdav1d.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
