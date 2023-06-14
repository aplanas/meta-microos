SUMMARY = "X Toolkit Intrinsics library"
DESCRIPTION = "The low level Xlib library provides functions for interacting with an \
X11 server, but does not provide any function for implementing the \
graphical objects (widgets) used in GUIs, such as buttons, menus, \
etc. The Xt library provides support for creating and using widget \
types, but does not provide any specific widget. Specific widgets are \
implemented by other libraries using Xt, such as Xaw and Motif."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "libXt6-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "a06d4b82b257590bc632aad3acc5d185208256cde555a9dae90f5a5c0b89c156bdaebc5dc0e91fcbd8444bd64c65718ed50096ea5229ff53c82713862ecc622a"

RPROVIDES:${PN} += "libXt.so.6 \
libXt6 \
xorg-x11-libXt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libc.so.6"

inherit rpm
