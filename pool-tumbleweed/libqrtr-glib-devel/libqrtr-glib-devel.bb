SUMMARY = "Development files for the Qualcomm IPC Router protocol helper library"
DESCRIPTION = "This package provides the development files for the Qualcomm IPC Router protocol helper library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libqrtr-glib-devel-1.2.2-1.4.aarch64.rpm"
RPM_HASH = "77a9999c3ef305963cae5f0a2c727c1311dfb354119a15c63517f016d536075489edfdfd69dd6b884cf07a2c9a469e2ce82aa628bf3075fcaafafd293beed01e"

RPROVIDES:${PN} += "libqrtr-glib-devel \
libqrtr-glib-devel(aarch-64) \
pkgconfig(qrtr-glib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqrtr-glib0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
typelib-1_0-Qrtr-1_0"

inherit rpm
