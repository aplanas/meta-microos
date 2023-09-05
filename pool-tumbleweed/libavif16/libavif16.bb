SUMMARY = "Shared library from libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the shared library for libavif."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "libavif16-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "9530badfd1237f203362c225898f265803384861d9a4054de3a50b54c0161a45d3fb7d1bbb707f86164452e66cff8947df479bbe95aeb2019d47e2a7da08b5ed"

RPROVIDES:${PN} += "libavif.so.16 \
libavif16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaom.so.3 \
libc.so.6 \
libdav1d.so.6 \
librav1e.so.0 \
libsharpyuv.so.0 \
libyuv.so.0"

inherit rpm
