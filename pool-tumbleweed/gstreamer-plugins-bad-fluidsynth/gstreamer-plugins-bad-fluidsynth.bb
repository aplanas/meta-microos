SUMMARY = "Fluidsynth plugin for GStreamer"
DESCRIPTION = "Add fluidsynth midi support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-bad-fluidsynth-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "9d42f21221ba40904629c4f6e6a65e19006c5dac77ea6568f39ecda35173ceb77792d61e07d158ffe26fe3e766255f13fcad73126d0e591667102b3c3fd82d53"

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
