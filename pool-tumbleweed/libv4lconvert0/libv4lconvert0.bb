SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4lconvert offers functions to convert from any (known) pixel-format \
to V4l2_PIX_FMT_BGR24 or V4l2_PIX_FMT_YUV420. \
 \
This package contains shared lib for packages that use libv4lconvert."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4lconvert0-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "d6ef22a627e0af3b0815dcdc9a39a5ff2bbc400ce5f87e8b87fceced2831552f37c5009cc50d4443d691ef0dc706a1573b7475fa0359d4bf97c829fce19fbe8d"

RPROVIDES:${PN} += "libv4lconvert.so.0 \
libv4lconvert0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libv4l"

inherit rpm
