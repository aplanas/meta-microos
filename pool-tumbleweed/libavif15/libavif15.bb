SUMMARY = "Shared library from libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the shared library for libavif."
LICENSE = "BSD-2-Clause"

PV = "0.11.1"

RPM_NAME = "libavif15-0.11.1-2.1.aarch64.rpm"
RPM_HASH = "f8a038f22c31a3dc27b17d7dc3e754fbfc97b50a6bf5c817f6678f37b166badd81e6c1feaa035e565c89836a4b9f0b38aff46a141471a161c76cec86276dba9c"

RPROVIDES:${PN} += "libavif.so.15()(64bit) \
libavif15 \
libavif15(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libaom.so.3()(64bit) \
libc.so.6()(64bit) \
libdav1d.so.6()(64bit) \
librav1e.so.0()(64bit) \
libsharpyuv.so.0()(64bit) \
libyuv.so.0()(64bit)"

inherit rpm
