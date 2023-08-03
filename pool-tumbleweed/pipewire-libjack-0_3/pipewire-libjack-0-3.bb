SUMMARY = "PipeWire libjack replacement libraries"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
Some of its features include: \
 \
 * Capture and playback of audio and video with minimal latency; \
 * Real-time Multimedia processing on audio and video; \
 * Multiprocess architecture to let applications share multimedia content; \
 * GStreamer plugins for easy use and integration in current applications; \
 * Sandboxed applications support. \
 \
This package provides the PipeWire replacement libraries for libjack."
LICENSE = "MIT"

PV = "0.3.76"

RPM_NAME = "pipewire-libjack-0_3-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "412c8c0152e08a5ba474be1fa7ae0cd93950568e4d2c439ebbc0aa568e1d3e9128ff82e08d80fc6ca948adc31c0614d95e35d52ac0ccaafc29d53f85e8823ca8"

RPROVIDES:${PN} += "libjack.so.0 \
libjacknet.so.0 \
libjackserver.so.0 \
pipewire-libjack-0-3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpipewire-0.3.so.0 \
update-alternatives"

inherit rpm
