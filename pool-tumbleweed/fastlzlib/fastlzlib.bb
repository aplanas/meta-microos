SUMMARY = "Zlib-like encapsulation interface to LZ4/FastLZ"
DESCRIPTION = "A library that bundles and wraps LZ4 and FastLZ in a zlib-like interface."
LICENSE = "BSD-2-Clause"

PV = "0.0+git.20150524"

RPM_NAME = "fastlzlib-0.0+git.20150524-2.20.aarch64.rpm"
RPM_HASH = "346cb7f80ba32a96a8e631cbc80412cec1e0be80166faaa3232fef604d028f55644c941f9f05755aac6a741a60a85e1f42bce3c5162b44212f08f33c1685dd2c"

RPROVIDES:${PN} += "fastlzlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastlz.so.1"

inherit rpm
