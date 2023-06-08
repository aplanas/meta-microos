SUMMARY = "Header files for the Cairo C++ interface"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of cairomm."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.1"

RPM_NAME = "cairomm-devel-1.16.1-2.3.aarch64.rpm"
RPM_HASH = "c8be6d9529fa49b6f25bc26ce6d739cd42d45059d9c6383a4feff64d191485731b314690a9e017b9b09bc9656c9962adfd6ffe4f01b08a8c8293d6de60b7f237"

RPROVIDES:${PN} += "cairomm-devel cairomm-devel(aarch-64) pkgconfig(cairomm-1.16) pkgconfig(cairomm-ft-1.16) pkgconfig(cairomm-pdf-1.16) pkgconfig(cairomm-png-1.16) pkgconfig(cairomm-ps-1.16) pkgconfig(cairomm-svg-1.16) pkgconfig(cairomm-xlib-1.16) pkgconfig(cairomm-xlib-xrender-1.16)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcairomm-1_16-1 pkgconfig(cairo) pkgconfig(cairo-ft) pkgconfig(cairo-pdf) pkgconfig(cairo-png) pkgconfig(cairo-ps) pkgconfig(cairo-svg) pkgconfig(cairo-xlib) pkgconfig(cairo-xlib-xrender) pkgconfig(cairomm-1.16) pkgconfig(sigc++-3.0)"

inherit rpm
