SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavutil56_70-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "06523790c0a17111ae1677bc68862be6c49d008f47e23e15350fdc3c95246b19212f83ac8e8bd7091885f82e52bb5a69545be01157426b8281cdd7b301c9a0e0"

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
