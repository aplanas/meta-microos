SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavutil56_70-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "68a1df3019167457c8e632e17af33151f7296a5075c840f5b30197673e46990baa9a5e8961725dc62c1f5c0d1e33df091ed43a4942bf1dbf75ecc905d7aa00b3"

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
