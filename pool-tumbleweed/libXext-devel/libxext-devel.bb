SUMMARY = "Development files for the X11 Common Extensions library"
DESCRIPTION = "The Xext library contains a handful of X11 extensions: \
- Double Buffer extension (DBE/Xdbe) \
- Display Power Management Signaling (DPMS) extension \
- X11 Nonrectangular Window Shape extension (Xshape) \
- The MIT Shared Memory extension (MIT-SHM/Xshm) \
- TOG-CUP (colormap) protocol extension (Xcup) \
- X Extended Visual Information extension (XEvi) \
- X11 Double-Buffering, Multi-Buffering, and Stereo extension (Xmbuf) \
 \
This package contains the development headers for the library found \
in libXext6."
LICENSE = "MIT"

PV = "1.3.5"

RPM_NAME = "libXext-devel-1.3.5-1.3.aarch64.rpm"
RPM_HASH = "8655d99f4fb04cbb6120263ab1bec1ee3334e3811b5ceb61ca6e89b43df8f44313114f8b37faff20734871068c1f101e00ba26cf11a8d01ca5ac7aeb3c157c10"

RPROVIDES:${PN} += "libXext-devel \
pkgconfig-xext \
xorg-x11-libXext-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXext6 \
pkgconfig-x11 \
pkgconfig-xextproto"

inherit rpm
