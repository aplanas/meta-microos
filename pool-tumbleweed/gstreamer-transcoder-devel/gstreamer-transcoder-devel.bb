SUMMARY = "Development files for the GStreamer Transcoding API"
DESCRIPTION = "This subpackage contains the header files needed to build applications \
making use of the GStreamer Transcoding API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-transcoder-devel-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "4e2fcc4279243f56870887b60e04fcdfedc00e864d676ed8c27cd410de9a6c7c71511f7c6b81b565b27ee0b5e0751d1bc4a213d692747161db7c1ec68d511ef1"

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
