SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-devel-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "72598d2e0de6f0f2696470cdf428856ba70f8e6e51ebc48967d51da7ccbdf06fcf0128bca1a8ee25c2d4259d190ae5a252f6ba75db59281a4548bfb3205489f5"

RPROVIDES:${PN} += "gstreamer-devel \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-check-1.0 \
pkgconfig-gstreamer-controller-1.0 \
pkgconfig-gstreamer-net-1.0"

RDEPENDS:${PN} += "/bin/bash \
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
