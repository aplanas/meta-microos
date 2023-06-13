SUMMARY = "Audio and Video processing media library"
DESCRIPTION = "Librem is a generic library for real-time audio \
and video processing. \
 \
Features: \
 * Audio buffering, mixing, codecs and resampling \
 * Video mixing, rescaling and pixel format conversion"
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "librem4-2.10.0-1.4.aarch64.rpm"
RPM_HASH = "2d490a7beb999308df7e600191aefffb2564e10c14c60b68803920e4b984bfa42d3e3114ea87322445ee81a14d531d3165e62f0ca42219ebbb2c9733e39dc75e"

RPROVIDES:${PN} += "librem.so.4()(64bit) \
librem4 \
librem4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libre.so.12()(64bit)"

inherit rpm
