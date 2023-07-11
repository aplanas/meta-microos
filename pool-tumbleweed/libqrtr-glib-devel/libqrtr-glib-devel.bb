SUMMARY = "Development files for the Qualcomm IPC Router protocol helper library"
DESCRIPTION = "This package provides the development files for the Qualcomm IPC Router protocol helper library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libqrtr-glib-devel-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "e0a3def94fed345c084737cc65a504d259f8c291e5af5cde5f295d7dd92eb4d1a7f335119a253aada3bf33d8af88fe7e757b161125efd1c3f6d73df7c2cad316"

RPROVIDES:${PN} += "libqrtr-glib-devel \
pkgconfig-qrtr-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqrtr-glib0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Qrtr-1-0"

inherit rpm
