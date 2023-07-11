SUMMARY = "Shared library for aravis"
DESCRIPTION = "Aravis is a glib/gobject based library implementing a Genicam interface, \
which can be used for the acquisition of video streams coming from either \
ethernet, firewire or USB cameras. It currently only implements an ethernet \
camera protocol used for industrial cameras. \
 \
This package contains the shared library for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "libaravis-0_8-0-0.8.26-1.2.aarch64.rpm"
RPM_HASH = "ec13b8c32db92c4fe482d3e7dc8ebbc2c2deef492d97ba67993c5d58f8de3b7cc552640926bd0bf8598976fffe2f59eebbac8afa3f9213c29f7cd868edf5f0da"

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
