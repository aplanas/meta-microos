SUMMARY = "Development files for the GStreamer Transcoding API"
DESCRIPTION = "This subpackage contains the header files needed to build applications \
making use of the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-transcoder-devel-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "77e29776e5ac51810c23a8d6ca528959edfffdb9c1acfc06f854c3b1f1d5491d1ee4ad1b0a3c94a237ec17aca39a0aa6a208d1626474ef25d380d2d50fa09a45"

RPROVIDES:${PN} += "gstreamer-transcoder-devel \
pkgconfig-gstreamer-transcoder-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-devel \
gstreamer-plugins-bad \
gstreamer-plugins-bad-devel \
libgsttranscoder-1-0-0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
typelib-1-0-GstTranscoder-1-0"

inherit rpm
