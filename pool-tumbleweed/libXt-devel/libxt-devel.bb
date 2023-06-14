SUMMARY = "Development files for the X Toolkit Intrinsics library"
DESCRIPTION = "The low level Xlib library provides functions for interacting with an \
X11 server, but does not provide any function for implementing the \
graphical objects (widgets) used in GUIs, such as buttons, menus, \
etc. The Xt library provides support for creating and using widget \
types, but does not provide any specific widget. Specific widgets are \
implemented by other libraries using Xt, such as Xaw and Motif. \
 \
This package contains the development headers for the library found \
in libXt6."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "libXt-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "13745b0d8d6c84d544a98f15efaa59bdda16bfe72ce028b1611b8c92330c0b26c149d381cacaa43d0522e4487bbd3a9d63c7c3083394bb1f2ae30ef7cb163678"

RPROVIDES:${PN} += "libXt-devel \
pkgconfig-xt \
xorg-x11-libXt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXt6 \
pkgconfig-ice \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xproto"

inherit rpm
