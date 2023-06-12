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

PV = "0.3.71"

RPM_NAME = "pipewire-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "f9c29248179804190859f5a0b8f8c36c917814104a09e27d54f91329e3ece94850bc76cb5b541091e46e7237bf673124346abef4ea25e93ff7499fde15cfcd0d"

RPROVIDES:${PN} += "pipewire \
pipewire(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpipewire-0.3.so.0()(64bit) \
libpipewire-0_3-0 \
pipewire-modules-0_3 \
pipewire-session-manager \
pipewire-spa-plugins-0_2 \
pipewire-spa-tools \
pipewire-tools \
rtkit"

inherit rpm
