SUMMARY = "GStreamer modules and libraries for videoconferencing -- Development files"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "farstream-devel-0.2.9+5-2.4.aarch64.rpm"
RPM_HASH = "3eae7af0f2ec5bb66da5ee07f458de37350e92f44095b23d74b470ea312dbd092742d4fb0c77f896b85bf58e29dfb66e79df07987a742bdee08549ebbf5ce418"

RPROVIDES:${PN} += "farstream-devel \
pkgconfig-farstream-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfarstream-0-2-5 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
typelib-1-0-Farstream-0-2"

inherit rpm
