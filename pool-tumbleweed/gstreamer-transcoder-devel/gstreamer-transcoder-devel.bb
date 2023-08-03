SUMMARY = "Development files for the GStreamer Transcoding API"
DESCRIPTION = "This subpackage contains the header files needed to build applications \
making use of the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-transcoder-devel-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "be7f02c4def9ed6427e5d16d11d82e6f932d5d9c5161b81f792750aa11ad90c62d96907eedcdd4056eaa6bdd689a01b755458fe6ae655d672dfc9dfa61a79aaf"

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
