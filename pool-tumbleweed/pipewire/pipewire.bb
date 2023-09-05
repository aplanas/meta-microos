SUMMARY = "A Multimedia Framework designed to be an audio and video server and more"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
Some of its features include: \
 \
 * Capture and playback of audio and video with minimal latency; \
 * Real-time Multimedia processing on audio and video; \
 * Multiprocess architecture to let applications share multimedia content; \
 * GStreamer plugins for easy use and integration in current applications; \
 * Sandboxed applications support."
LICENSE = "MIT"

PV = "0.3.79"

RPM_NAME = "pipewire-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "9247f60746d12a02027e5d3d1f3a094d7551c202fc532f153406d7365d2535b905cbbf7c2928fe0df878e0afcd96ba7b15d3acd791bdbca4859a15e04f9821e0"

RPROVIDES:${PN} += "pipewire"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpipewire-0-3-0 \
libpipewire-0.3.so.0 \
pipewire-modules-0-3 \
pipewire-session-manager \
pipewire-spa-plugins-0-2 \
pipewire-spa-tools \
pipewire-tools \
rtkit"

inherit rpm
