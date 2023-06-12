SUMMARY = "GStreamer modules and libraries for videoconferencing -- Development files"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "farstream-devel-0.2.9+5-2.3.aarch64.rpm"
RPM_HASH = "d9928d59f273bdc80a9e8fe07243455adfc8bb89106fe85b73ee99584544ef16b357da923c470e8706e7b107c921c7d6f8e6017432fb170fe785e8d29cbd78f1"

RPROVIDES:${PN} += "farstream-devel \
farstream-devel(aarch-64) \
pkgconfig(farstream-0.2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfarstream-0_2-5 \
pkgconfig(gstreamer-1.0) \
pkgconfig(gstreamer-base-1.0) \
typelib-1_0-Farstream-0_2"

inherit rpm
