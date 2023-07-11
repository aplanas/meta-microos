SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavutil58-6.0-2.4.aarch64.rpm"
RPM_HASH = "d70f358d81c9c45df421403805d869108107ae52b42d280851a004619934a7f6120b54dcfe42439a62839da86b1d7b8ac30ca4f5377ea4ddc2bc51cfcdf13e0f"

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
