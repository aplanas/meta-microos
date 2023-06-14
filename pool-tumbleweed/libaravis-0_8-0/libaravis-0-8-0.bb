SUMMARY = "Shared library for aravis"
DESCRIPTION = "Aravis is a glib/gobject based library implementing a Genicam interface, \
which can be used for the acquisition of video streams coming from either \
ethernet, firewire or USB cameras. It currently only implements an ethernet \
camera protocol used for industrial cameras. \
 \
This package contains the shared library for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "libaravis-0_8-0-0.8.26-1.1.aarch64.rpm"
RPM_HASH = "0af0e1ba052e6e2b3576f0d6f9d0945f9eb9d590f7007f4bf5c57ccd2e980bfc3f14494073058ea2f8436cc1806be71c9942cb67d2e2d3f7f0c387d71fe48c82"

RPROVIDES:${PN} += "libaravis-0-8-0 \
libaravis-0.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libusb-1.0.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
