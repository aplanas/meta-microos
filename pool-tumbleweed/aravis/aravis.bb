SUMMARY = "Glib/gobject based library implementing a Genicam interface"
DESCRIPTION = "Aravis is a glib/gobject based library implementing a Genicam interface, \
which can be used for the acquisition of video streams coming from either \
ethernet, firewire or USB cameras. It currently only implements an ethernet \
camera protocol used for industrial cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "aravis-0.8.26-1.2.aarch64.rpm"
RPM_HASH = "f267a51aa956485e6f82e7005488886fa1098770adf9347900fe72df4ae7c20735216c4391cd59f532ac7ef88d4e92f5aa41f75ccd5f263fbba0c62bbf5f18e3"

RPROVIDES:${PN} += "aravis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaravis-0.8.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
