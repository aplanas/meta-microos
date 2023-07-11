SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavutil56_70-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "e3fa5c1d04936756de99b54cef5f64a67afd10bee9b325e3fb2d3f0640e80cd2855bd4cdbbb30c5776764870ed0de9ccedbe101b76b78c1712d14e26fee37865"

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
