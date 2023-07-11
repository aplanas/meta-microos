SUMMARY = "Zlib-like encapsulation interface to LZ4/FastLZ"
DESCRIPTION = "A library that bundles and wraps LZ4 and FastLZ in a zlib-like interface."
LICENSE = "BSD-2-Clause"

PV = "0.0+git.20150524"

RPM_NAME = "libfastlz1-0.0+git.20150524-2.20.aarch64.rpm"
RPM_HASH = "debcd7dee02cde0da737505c49f1b48457c5b378288cdbd5a2c924b58b4198781d8cca72db53539e82e30168cdcf0e234cf76ff6e7bf5374bc2c260a4e6008ea"

RPROVIDES:${PN} += "libfastlz.so.1 \
libfastlz1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
