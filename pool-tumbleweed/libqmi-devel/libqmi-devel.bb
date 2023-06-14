SUMMARY = "Development files for the QMI device control library"
DESCRIPTION = "A GLib/GIO based library to control QMI devices \
 \
This package contains files required to link sources against libqmi."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.32.4"

RPM_NAME = "libqmi-devel-1.32.4-1.1.aarch64.rpm"
RPM_HASH = "0d8a5b22d527baa8be365b0484ff3090c52615d7ecbce4bde7e226386aa9513cb3aadfd72afcc9e6649f5b80137c54d857e81f1cac30ba0e54e56030310d761e"

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
