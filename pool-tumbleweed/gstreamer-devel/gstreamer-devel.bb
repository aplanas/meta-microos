SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-devel-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "3d2377b89e2acb26f3e3cf51119a37045d2e7ef99eb08eb36e3fad1e8bb57e1433fead34a7ab62eb9c1815b16021dd41d34c42d45ab2581b3af5c9458e96c520"

RPROVIDES:${PN} += "gstreamer-devel \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-check-1.0 \
pkgconfig-gstreamer-controller-1.0 \
pkgconfig-gstreamer-net-1.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/python3 \
gstreamer \
gstreamer-utils \
libgstreamer-1-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-libdw \
pkgconfig-libunwind \
typelib-1-0-Gst-1-0"

inherit rpm
