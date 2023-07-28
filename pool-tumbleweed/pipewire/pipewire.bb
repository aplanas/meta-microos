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

PV = "0.3.74"

RPM_NAME = "pipewire-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "95e3588b35a42ee118b8612ff358c9208e19f8efa52fb70d913a9237aee7de881a1599255eb6b7d87c875e604f5481bef347c2e65e516ba7cfb126ae857ab51c"

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
