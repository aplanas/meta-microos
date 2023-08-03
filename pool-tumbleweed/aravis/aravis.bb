SUMMARY = "Glib/gobject based library implementing a Genicam interface"
DESCRIPTION = "Aravis is a glib/gobject based library implementing a Genicam interface, \
which can be used for the acquisition of video streams coming from either \
ethernet, firewire or USB cameras. It currently only implements an ethernet \
camera protocol used for industrial cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.27"

RPM_NAME = "aravis-0.8.27-1.1.aarch64.rpm"
RPM_HASH = "744ac8fcfe5c1a1f9d13c8b043e8e67d7a2c39741427611209bda0b6d19a7c956403541657c3452c6f6196cb30400c99aca8b943fd165082b17cc55289594644"

RPROVIDES:${PN} += "aravis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaravis-0.8.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
