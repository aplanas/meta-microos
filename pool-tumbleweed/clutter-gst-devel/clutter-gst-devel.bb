SUMMARY = "GStreamer integration for Clutter"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GStreamer enables the use of GStreamer with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.27"

RPM_NAME = "clutter-gst-devel-3.0.27-2.4.aarch64.rpm"
RPM_HASH = "5242b59e95e3355817202b22dbee61fc08f2ed97332d677cb843233f0fecbd4cdede9e0785d80a08de39edfb4dc9c8ee3caeb04925a6944cb95b3c950dda9df8"

RPROVIDES:${PN} += "clutter-doc \
clutter-gst-devel \
clutter-gst-devel(aarch-64) \
pkgconfig(clutter-gst-3.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gstreamer-plugin-cluttergst3 \
libclutter-gst-3_0-0 \
pkgconfig(clutter-1.0) \
pkgconfig(cogl-2.0-experimental) \
pkgconfig(gio-2.0) \
pkgconfig(gstreamer-1.0) \
pkgconfig(gstreamer-base-1.0) \
pkgconfig(gstreamer-plugins-base-1.0) \
pkgconfig(gstreamer-video-1.0) \
typelib-1_0-ClutterGst-3_0"

inherit rpm
