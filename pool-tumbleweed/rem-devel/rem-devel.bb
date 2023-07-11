SUMMARY = "Librem development files"
DESCRIPTION = "Librem is a generic library for real-time audio \
and video processing. \
 \
Features: \
 * Audio buffering, mixing, codecs and resampling \
 * Video mixing, rescaling and pixel format conversion \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of librem."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "rem-devel-2.10.0-1.5.aarch64.rpm"
RPM_HASH = "40236ad1bc9bab019c54507cf6bedb9db2aa8fdf3b9d85cc2fade0bf84102d262f0cd02803b56634bcd252b5cce1679787772dc6db3412b8ba3586507639d11e"

RPROVIDES:${PN} += "pkgconfig-librem \
rem-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librem4"

inherit rpm
