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

PV = "0.3.74"

RPM_NAME = "pipewire-libjack-0_3-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "bf99fac221ee810aa7cab929b200e1450d06771713fc570f85f1c0ea05b856621e6e6b9e0a9ce471decd2061742848105f15634698a004b2d9c25797aa2c30b5"

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
