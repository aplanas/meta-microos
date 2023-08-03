SUMMARY = "Shared library for aravis"
DESCRIPTION = "Aravis is a glib/gobject based library implementing a Genicam interface, \
which can be used for the acquisition of video streams coming from either \
ethernet, firewire or USB cameras. It currently only implements an ethernet \
camera protocol used for industrial cameras. \
 \
This package contains the shared library for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.27"

RPM_NAME = "libaravis-0_8-0-0.8.27-1.1.aarch64.rpm"
RPM_HASH = "2d886546b31cf1a6405db54e6d5a974ac689e083d65a9c5f122d5c37955599a76605cd8d08eba06949edba3c95eadd07fa7c75c5ae6dbce2296d15d3190b04f1"

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
