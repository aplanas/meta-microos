SUMMARY = "Qualcomm IPC Router protocol helper library"
DESCRIPTION = "libqrtr-glib is a glib-based library to use and manage the QRTR (Qualcomm \
IPC Router) bus."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libqrtr-glib0-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "3c7708c6aa02cb0843c5b5892c5b24e6f6f13270f7fc81c005f60357a6db275ec4ccaf26ed3d24666252f14ab7ccfade7413319c6d137e4b2a15b218975d7bce"

RPROVIDES:${PN} += "libqrtr-glib.so.0 \
libqrtr-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
