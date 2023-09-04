SUMMARY = "Audio and Video processing media library"
DESCRIPTION = "Librem is a generic library for real-time audio \
and video processing. \
 \
Features: \
 * Audio buffering, mixing, codecs and resampling \
 * Video mixing, rescaling and pixel format conversion"
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "librem4-2.10.0-1.6.aarch64.rpm"
RPM_HASH = "4c80030f8e136552a9ab3188f33dbca051ebda7117ea8517287860f45e8e076ee40b8836ae0a16b4154c8ee357cea7665ad5ea9e3ff92c7e95dc3d9ade990703"

RPROVIDES:${PN} += "librem.so.4 \
librem4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libre.so.16"

inherit rpm
