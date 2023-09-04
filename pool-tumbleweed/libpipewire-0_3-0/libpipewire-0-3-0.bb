SUMMARY = "A Multimedia Framework designed to be an audio and video server and more"
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
This package provides the PipeWire shared library."
LICENSE = "MIT"

PV = "0.3.77"

RPM_NAME = "libpipewire-0_3-0-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "3fa3cebecf33808bfe20587a76fbe5a9af3df967cd57c3d63aa77b82347dd9b2c74f2f947a6d348dfc82d4b4857756035e732340b825d21c46335edd173a5486"

RPROVIDES:${PN} += "libpipewire-0-3-0 \
libpipewire-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
pipewire-modules-0-3 \
pipewire-spa-plugins-0-2"

inherit rpm
