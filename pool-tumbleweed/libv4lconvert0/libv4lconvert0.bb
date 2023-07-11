SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4lconvert offers functions to convert from any (known) pixel-format \
to V4l2_PIX_FMT_BGR24 or V4l2_PIX_FMT_YUV420. \
 \
This package contains shared lib for packages that use libv4lconvert."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4lconvert0-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "2a6acd4353b93ac0fa2a263ca54268124503d134977dc4b2158c447895d1fc64a2a47a87302445c0d01ca0d45a39f63b3790822694f08b3a5df7650647dacc98"

RPROVIDES:${PN} += "libv4lconvert.so.0 \
libv4lconvert0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libv4l"

inherit rpm
