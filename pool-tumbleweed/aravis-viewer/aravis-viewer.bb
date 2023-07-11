SUMMARY = "Glib/gobject based library implementing a Genicam interface"
DESCRIPTION = "This package contains arv-viewer, GUI application for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "aravis-viewer-0.8.26-1.2.aarch64.rpm"
RPM_HASH = "2edad50d10ee853f61462ced9c7f682d892505d32b9cfaf6188bd6fcef2841314417b915b2d222036177d1d47824d9b6369876148cc31229bb6f49db1b0d3562"

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
