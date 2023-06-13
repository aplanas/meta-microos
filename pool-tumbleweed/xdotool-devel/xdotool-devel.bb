SUMMARY = "Development and Library files"
DESCRIPTION = "This tool lets you programatically (or manually) simulate keyboard input and \
mouse activity, move and resize windows, etc. It does this using X11's XTEST \
extension and other Xlib functions. \
 \
Library and Header files for xdotool"
LICENSE = "BSD-3-Clause"

PV = "3.20211022.1"

RPM_NAME = "xdotool-devel-3.20211022.1-1.6.aarch64.rpm"
RPM_HASH = "752491c62d5318a73d739ff764cf0e8a5fc0e5af180a9691c587b4a82abb611222f3789894c2deae2b4d59c9146a9c4c3f129c836603bb14df58eaeb40021680"

RPROVIDES:${PN} += "pkgconfig(libxdo) \
xdotool-devel \
xdotool-devel(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
pkgconfig(x11) \
xdotool"

inherit rpm
