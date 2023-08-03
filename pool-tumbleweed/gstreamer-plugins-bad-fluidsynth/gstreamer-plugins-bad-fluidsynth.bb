SUMMARY = "Fluidsynth plugin for GStreamer"
DESCRIPTION = "Add fluidsynth midi support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-bad-fluidsynth-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "acdd315ec3f6f8318f5cbbe5c7026fe64db5f302c8d7c252b90e8e130d02cdfa79355eb49ce6cd612787f84ca70c5eadb4684e02759e54637c4c6dc345254de9"

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
