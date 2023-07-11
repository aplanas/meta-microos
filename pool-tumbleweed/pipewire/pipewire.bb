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

PV = "0.3.72"

RPM_NAME = "pipewire-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "44b15faa9e9cbb0777537f24f1a495ca0dd184cec4c076acba4a4ffcbc891cd22e7e672f05caad716edf325c37487e3603bdaefaa52d85a15c7aced0572eb602"

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
