SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-devel-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "e13d402733a999aaa8cc92e5142c209386910e4d6d215eb0f6f76145176647a4b3ec30ad7bd9ba421ca9e6465671a3b5fe7cc22c8f9ebee985fbeee6e493bf9c"

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
