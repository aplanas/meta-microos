SUMMARY = "Development and Library files"
DESCRIPTION = "This tool lets you programatically (or manually) simulate keyboard input and \
mouse activity, move and resize windows, etc. It does this using X11's XTEST \
extension and other Xlib functions. \
 \
Library and Header files for xdotool"
LICENSE = "BSD-3-Clause"

PV = "3.20211022.1"

RPM_NAME = "xdotool-devel-3.20211022.1-1.7.aarch64.rpm"
RPM_HASH = "e7ed1cb906c313b985777cc9da1439033c15124e29781f94d3ff40d9674a6c905ee3e3aca47f112b30ffb414845c36d942dd8db28d0d651a00683c56da72b288"

RPROVIDES:${PN} += "pkgconfig-libxdo \
xdotool-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
pkgconfig-x11 \
xdotool"

inherit rpm
