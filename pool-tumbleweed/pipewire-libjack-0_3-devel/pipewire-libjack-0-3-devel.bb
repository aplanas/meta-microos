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

PV = "0.3.79"

RPM_NAME = "pipewire-libjack-0_3-devel-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "92e5fbd7b09a4192499cc27b66578d4974fc2a55171dde844cc6a520ecdef58d39d9171a51299e17f864c2975292be65a7d1a92f5953a02b4a746ec4d2a0afb2"

RPROVIDES:${PN} += "pipewire-libjack-0-3-devel \
pkgconfig-jack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pipewire-libjack-0-3"

inherit rpm
