SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavutil58-6.0-3.1.aarch64.rpm"
RPM_HASH = "e5c86175c81eefd576666a276f26c706d4ece6993d34d7a17507e310f06841f45ef65558cd087880009ede141fbebe19eb4ae937587144cbf81b4fdd838a47ba"

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
