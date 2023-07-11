SUMMARY = "Development files for the QMI device control library"
DESCRIPTION = "A GLib/GIO based library to control QMI devices \
 \
This package contains files required to link sources against libqmi."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.32.4"

RPM_NAME = "libqmi-devel-1.32.4-1.2.aarch64.rpm"
RPM_HASH = "7f8a5eccdc937e7735d5f89f84bbc314d03e0997d9dda6313c74269dcaa51d80bde332e4c4940f18cc0f56f56953f7c04d648814f16752bf8752a9e4a199f604"

RPROVIDES:${PN} += "libqmi-devel \
pkgconfig-qmi-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqmi-glib5 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-mbim-glib \
pkgconfig-qrtr-glib \
typelib-1-0-Qmi-1-0"

inherit rpm
