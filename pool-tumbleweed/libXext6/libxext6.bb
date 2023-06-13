SUMMARY = "Common extensions to the X11 protocol"
DESCRIPTION = "The Xext library contains a handful of X11 extensions: \
- Double Buffer extension (DBE/Xdbe) \
- Display Power Management Signaling (DPMS) extension \
- X11 Nonrectangular Window Shape extension (Xshape) \
- The MIT Shared Memory extension (MIT-SHM/Xshm) \
- TOG-CUP (colormap) protocol extension (Xcup) \
- X Extended Visual Information extension (XEvi) \
- X11 Double-Buffering, Multi-Buffering, and Stereo extension (Xmbuf)"
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "libXext6-1.3.5-1.2.aarch64.rpm"
RPM_HASH = "ec23faca0faff364710a29155cb1d063b58e072553718be6b3ed2dd8b6d82e121d2fe7dc259e872883331cda29f7b845e00463ee8d18c29a3202f090bd1adcf5"

RPROVIDES:${PN} += "libXext.so.6()(64bit) \
libXext6 \
libXext6(aarch-64) \
xorg-x11-libXext"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.26)(64bit)"

inherit rpm
