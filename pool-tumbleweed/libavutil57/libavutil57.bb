SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavutil57-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "a4ba1e0d754b852549b0788dec5ccf681c899c9251b10e6f5d2a50bd1e38fd29eb0838354e83c668674f098e82db3fc4483aad4093405e4cb29351ebc7701272"

RPROVIDES:${PN} += "libavutil.so.57()(64bit) \
libavutil57 \
libavutil57(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libm.so.6()(64bit) \
libva-drm.so.2()(64bit) \
libva-x11.so.2()(64bit) \
libva.so.2()(64bit) \
libvdpau.so.1()(64bit)"

inherit rpm
