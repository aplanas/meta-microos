SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavutil56_70-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "cf5a06bc911dfb494198db46ecee4eb7b764e1470f4c0d0687f8136aab62f684f0eb05fb4e9b9e1d0e48e4d934b7c9e3a4b81a1a17410fb2ae76184be6de197a"

RPROVIDES:${PN} += "libavutil.so.56.70 \
libavutil56-70"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libm.so.6 \
libva-drm.so.2 \
libva.so.2 \
libvdpau.so.1 \
libvulkan.so.1"

inherit rpm
