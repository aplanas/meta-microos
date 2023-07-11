SUMMARY = "Audio and Video processing media library"
DESCRIPTION = "Librem is a generic library for real-time audio \
and video processing. \
 \
Features: \
 * Audio buffering, mixing, codecs and resampling \
 * Video mixing, rescaling and pixel format conversion"
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "librem4-2.10.0-1.5.aarch64.rpm"
RPM_HASH = "e65b8d512d830ce951b9edbbb54087313fd7b2ed634123a678a8f616fb181ecf850597408a602270e4e0dfe437ee1826a17d50a75a7326c8053cb665f43239e9"

RPROVIDES:${PN} += "librem.so.4 \
librem4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libre.so.12"

inherit rpm
