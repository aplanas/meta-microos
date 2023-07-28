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

PV = "0.3.74"

RPM_NAME = "pipewire-libjack-0_3-devel-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "81b1b93c7ceeb863a89193e598c2dc1bcc8b7a30d9b39d47b085015f7207e0bd0194f0ed339c85a3e0a820989669e26c4a93f6cd0f344b27f72bfa905b312662"

RPROVIDES:${PN} += "pipewire-libjack-0-3-devel \
pkgconfig-jack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pipewire-libjack-0-3"

inherit rpm
