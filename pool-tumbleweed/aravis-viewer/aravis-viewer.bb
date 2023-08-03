SUMMARY = "Glib/gobject based library implementing a Genicam interface"
DESCRIPTION = "This package contains arv-viewer, GUI application for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.27"

RPM_NAME = "aravis-viewer-0.8.27-1.1.aarch64.rpm"
RPM_HASH = "4c0e360e170d66d64d36b0fc0503ed87096c7ce395730b19ed6b0944bb3b9a02db8d910fd004b735ac498bee46cac9a04ad9c82919734c81379952d49daf7fc0"

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
