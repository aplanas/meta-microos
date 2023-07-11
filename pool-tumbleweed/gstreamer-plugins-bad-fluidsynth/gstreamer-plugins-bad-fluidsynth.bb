SUMMARY = "Fluidsynth plugin for GStreamer"
DESCRIPTION = "Add fluidsynth midi support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-plugins-bad-fluidsynth-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "8d0c4515d42cbf78235f0c3df85c6f1dbb20e473c673395f04def59aac2fd4c39b0d73cf18b007a783942ff50b727f24b2b1b0c336434ac07a9c64c8645c180b"

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
