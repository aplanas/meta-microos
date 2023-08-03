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

PV = "0.3.76"

RPM_NAME = "pipewire-libjack-0_3-devel-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "338d2d608143943e295ce0a7a16be7c8a5f386e9f347b09919d75c1f2e496fae99342c993de73a03bc3fb5ade2e701e63cb2ee0e9335693e9012dde7e68be53b"

RPROVIDES:${PN} += "pipewire-libjack-0-3-devel \
pkgconfig-jack"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pipewire-libjack-0-3"

inherit rpm
