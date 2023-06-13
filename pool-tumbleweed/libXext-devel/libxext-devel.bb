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

RPM_NAME = "libXext-devel-1.3.5-1.2.aarch64.rpm"
RPM_HASH = "80cae16946ceadafcf13b3c14955d4a08f6be5eeb0ecdf9ee70e7f99f98f6abcc35d50cf8e42832a17b0b7210bca355b4d1d9c370972b96d799d11d2a232b192"

RPROVIDES:${PN} += "libXext-devel \
libXext-devel(aarch-64) \
pkgconfig(xext) \
xorg-x11-libXext-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXext6 \
pkgconfig(x11) \
pkgconfig(xextproto)"

inherit rpm
