SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavutil58-6.0-2.2.aarch64.rpm"
RPM_HASH = "6ebf674ef767336ffab616931835eba1f67c96c69b73b430d7fd453cd4652e13fbfa3c3974955c9b953d7293f8d3ce4e2356437d10cf71a57845e6a59b476f35"

RPROVIDES:${PN} += "libavutil.so.58 \
libavutil58"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libm.so.6 \
libva-drm.so.2 \
libva-x11.so.2 \
libva.so.2 \
libvdpau.so.1"

inherit rpm
