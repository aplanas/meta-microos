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

RPM_NAME = "rem-devel-2.10.0-1.6.aarch64.rpm"
RPM_HASH = "edd7469ac32816db078d11bc04467386df134941a28dab2c52d82c61024ae134d0d6d94ab33adc51eeaa15cd36ce98249f3d989a40145f14d67afe2cc6cebd85"

RPROVIDES:${PN} += "pkgconfig-librem \
rem-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librem4"

inherit rpm
