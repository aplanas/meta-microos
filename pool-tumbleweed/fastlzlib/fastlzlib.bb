SUMMARY = "Zlib-like encapsulation interface to LZ4/FastLZ"
DESCRIPTION = "A library that bundles and wraps LZ4 and FastLZ in a zlib-like interface."
LICENSE = "BSD-2-Clause"

PV = "0.0+git.20150524"

RPM_NAME = "fastlzlib-0.0+git.20150524-2.19.aarch64.rpm"
RPM_HASH = "09af61cd1929deb3e5af6e727b087871f1e6dba0dfd9b25f05f4d0b724daf877d7e762dec945f32eb63bd44781710006a0a38bee39c00ca36adfd75e2a3983d2"

RPROVIDES:${PN} += "fastlzlib \
fastlzlib(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfastlz.so.1()(64bit)"

inherit rpm
