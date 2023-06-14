SUMMARY = "Glib/gobject based library implementing a Genicam interface"
DESCRIPTION = "This package contains arv-viewer, GUI application for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "aravis-viewer-0.8.26-1.1.aarch64.rpm"
RPM_HASH = "8b9b61044f6081726c0690d9c482b31a9c8710a5bbd8e9db9b022cca4ed987d33114d4a503eef8c1a1058ac593e5aec6107f1cae9265c3cd1b82f1b5e71832c1"

RPROVIDES:${PN} += "aravis-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaravis-0.8.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
