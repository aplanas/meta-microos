SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavutil57-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "4c8d15788348184d2368a5a946cf765a2ff7f11a76872b224a4ed4e24338f3fd6b1caa19c12aacdce83e2f2b71514ca99e85196db20317f0150ffec87c3d885d"

RPROVIDES:${PN} += "libavutil.so.57 \
libavutil57"

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
