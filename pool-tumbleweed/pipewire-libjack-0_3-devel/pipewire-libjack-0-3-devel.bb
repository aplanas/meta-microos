SUMMARY = "Development files for pipewire-libjack-0_3"
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
This package provides the PipeWire replacement development files \
for libjack."
LICENSE = "MIT"

PV = "0.3.77"

RPM_NAME = "pipewire-libjack-0_3-devel-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "2cac34de4b89a687e24bb5c44e6f2c2b6fa6aa6142d6578de2398f2f563e40d508c28c5ac6ae8c3f188ff5007e11a64a248d754620f70176f6b4370317819085"

RPROVIDES:${PN} += "pipewire-libjack-0-3-devel \
pkgconfig-jack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pipewire-libjack-0-3"

inherit rpm
