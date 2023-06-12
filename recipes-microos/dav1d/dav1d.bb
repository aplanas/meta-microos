SUMMARY = "An AV1 decoder"
DESCRIPTION = "dav1d is a SIMD-enhanced decoder for AV1 video. It features \
 \
 * Accelerated assembly using x86 AVX2. \
 * Partial acceleration using x86 SSSE3 and ARM NEON. \
 * Support for bitdepths 8, 10 and 12. \
 * Support for chroma subsamplings 4:2:0, 4:2:2, 4:4:4 and grayscale. \
 \
AV1 is a royalty-free video codec by the Alliance for Open Media. It \
has the potential to be up to 20% better than the HEVC codec. \
dav1d outperforms gav1 by about 20% on ARM and 50% on x86, \
and has better scaling properties for larger thread counts."
LICENSE = "BSD-2-Clause"

PV = "1.2.1"

RPM_NAME = "dav1d-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "6047a8a686fda81bc606527beef080e0b723d3b68c6973be53b3e58f94b59b48da494f84c7e6a9c13bb46af03d0bcfd8d556b65f86ce3e78f5b7cae89e60ff2f"

RPROVIDES:${PN} += "dav1d dav1d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdav1d.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
