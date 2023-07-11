SUMMARY = "File Manager for the GNOME Desktop -- Development Files"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains development files for nautilus."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "nautilus-devel-44.2-2.1.aarch64.rpm"
RPM_HASH = "002062065ce99a340c4586e482153d5b1b83d93898148fb20e2080899297275b1286ddd4a3f7b6c244c9fa4d0e8134727f557a1eda845118b59d43af80bc4a27"

RPROVIDES:${PN} += "nautilus-devel \
pkgconfig-libnautilus-extension-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnautilus-extension4 \
nautilus \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Nautilus-4-0"

inherit rpm
