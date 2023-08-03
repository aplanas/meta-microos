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

PV = "0.3.76"

RPM_NAME = "pipewire-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "9a269f6da9145394e19d551fa4338094351280a76040cfef43a3fff4ba3f44165b39f6c6cadd1ac1e80452b93d49739f52bf87dd7b0c4b0f1cc708a769cfaf54"

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
