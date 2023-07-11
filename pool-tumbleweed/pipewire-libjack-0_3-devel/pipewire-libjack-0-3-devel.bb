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

PV = "0.3.72"

RPM_NAME = "pipewire-libjack-0_3-devel-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "5a1b795234a9780acd6717a9cde63caab154670e828064d639a03f7fd4a816a54288326ab4bc43de63210d72b18a1086d8b6526bf8086b30d5c686c4332e8008"

RPROVIDES:${PN} += "pipewire-libjack-0-3-devel \
pkgconfig-jack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pipewire-libjack-0-3"

inherit rpm
