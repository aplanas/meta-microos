SUMMARY = "Shared library from libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the shared library for libavif."
LICENSE = "BSD-2-Clause"

PV = "0.11.1"

RPM_NAME = "libavif15-0.11.1-2.2.aarch64.rpm"
RPM_HASH = "1f8ebda8d5018bf753f74c1fd6229f83b7510efbbc3af6ffd3d582718643ab5c89ba85740fce8d3f4d178b024577e720ae83c27a1d05cf9f3e5f705ebf674d31"

RPROVIDES:${PN} += "libavif.so.15 \
libavif15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaom.so.3 \
libc.so.6 \
libdav1d.so.6 \
librav1e.so.0 \
libsharpyuv.so.0 \
libyuv.so.0"

inherit rpm
