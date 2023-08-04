SUMMARY = "Fluidsynth plugin for GStreamer"
DESCRIPTION = "Add fluidsynth midi support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-bad-fluidsynth-1.22.5-2.1.aarch64.rpm"
RPM_HASH = "f51c2316fdf02395c4453f01b5cdfff8c635f09c304cde257124e56bfb4fc5c05cc1ecbd222ac664bd7a8073b557c81b4dd3ecdff112e9f9b295354f45b2f832"

RPROVIDES:${PN} += "gstreamer-plugins-bad-fluidsynth \
gstreamer1 \
libgstfluidsynthmidi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfluidsynth.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
