SUMMARY = "Header files for the Cairo C++ interface"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of cairomm1_0."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "cairomm1_0-devel-1.12.2-4.3.aarch64.rpm"
RPM_HASH = "5d36270d316347d76ae36667c6801899310dad7637720495a8e114dc46709356331af890fbe8e4a86d87729422e114ee88b2a8e0cc9c20a1e2c72a45653e47b5"

RPROVIDES:${PN} += "cairomm1_0-devel \
cairomm1_0-devel(aarch-64) \
pkgconfig(cairomm-1.0) \
pkgconfig(cairomm-ft-1.0) \
pkgconfig(cairomm-pdf-1.0) \
pkgconfig(cairomm-png-1.0) \
pkgconfig(cairomm-ps-1.0) \
pkgconfig(cairomm-svg-1.0) \
pkgconfig(cairomm-xlib-1.0) \
pkgconfig(cairomm-xlib-xrender-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcairomm-1_0-1 \
pkgconfig(cairo) \
pkgconfig(cairo-ft) \
pkgconfig(cairo-pdf) \
pkgconfig(cairo-png) \
pkgconfig(cairo-ps) \
pkgconfig(cairo-svg) \
pkgconfig(cairo-xlib) \
pkgconfig(cairo-xlib-xrender) \
pkgconfig(cairomm-1.0) \
pkgconfig(sigc++-2.0)"

inherit rpm
