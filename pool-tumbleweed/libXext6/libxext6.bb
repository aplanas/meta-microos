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

RPM_NAME = "libXext6-1.3.5-1.3.aarch64.rpm"
RPM_HASH = "cde0ffa94fa2de472c5626dcae2111fdb575e08fdc5ca718a0e410322f21e2e1f5b3fb545af06f1108147c4aab2304423a996b1508bc7b289724b7b20d8d1857"

RPROVIDES:${PN} += "libXext.so.6 \
libXext6 \
xorg-x11-libXext"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
