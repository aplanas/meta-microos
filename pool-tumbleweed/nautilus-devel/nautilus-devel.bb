SUMMARY = "File Manager for the GNOME Desktop -- Development Files"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains development files for nautilus."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "nautilus-devel-44.2-1.1.aarch64.rpm"
RPM_HASH = "7d04d9cc00e16b99d44526b2426e81809649f33d257d2f1dc1e2916d62a868f82c75fdb0d0c2105f3bc0e53bb60250cc162793b50d4ea8a5a1630fd1eedd4391"

RPROVIDES:${PN} += "nautilus-devel \
pkgconfig-libnautilus-extension-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnautilus-extension4 \
nautilus \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Nautilus-4-0"

inherit rpm
