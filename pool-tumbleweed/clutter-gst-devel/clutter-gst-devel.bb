SUMMARY = "GStreamer integration for Clutter"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GStreamer enables the use of GStreamer with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "clutter-gst-devel-3.0.27-2.5.aarch64.rpm"
RPM_HASH = "d322ecc2751733414a4fd5a859a1d93f3269dfacd81ba86efffffdb0aa081f62fe43eb2fa209b04f2450111d3f535dee519a4351dc34792ca303c2814a8c7279"

RPROVIDES:${PN} += "clutter-doc \
clutter-gst-devel \
pkgconfig-clutter-gst-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-plugin-cluttergst3 \
libclutter-gst-3-0-0 \
pkgconfig-clutter-1.0 \
pkgconfig-cogl-2.0-experimental \
pkgconfig-gio-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-plugins-base-1.0 \
pkgconfig-gstreamer-video-1.0 \
typelib-1-0-ClutterGst-3-0"

inherit rpm
