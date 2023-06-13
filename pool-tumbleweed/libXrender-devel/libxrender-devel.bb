SUMMARY = "Development files for the X11 Render Extension library"
DESCRIPTION = "The Xrender library is designed as a lightweight library interface to \
the Render extension. \
 \
This package contains the development headers for the library found \
in libXrender1."
LICENSE = "MIT"

PV = "0.9.11"

RPM_NAME = "libXrender-devel-0.9.11-1.2.aarch64.rpm"
RPM_HASH = "def553afbee82a9f9c971992028ed9eec0cf740d1dc4f2b5e2a25627580a305d0c21cc4b7fe87ff331078032aa11d187a4fddb5e9a84f16f5d370661d3d9a764"

RPROVIDES:${PN} += "libXrender-devel \
libXrender-devel(aarch-64) \
pkgconfig(xrender) \
xorg-x11-libXrender-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXrender1 \
pkgconfig(renderproto) \
pkgconfig(x11) \
pkgconfig(xproto)"

inherit rpm
