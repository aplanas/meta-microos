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

PV = "0.3.74"

RPM_NAME = "libpipewire-0_3-0-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "da68f0bf2ab10b95a79acece6c255462c3cd872b97988964b5983d4b9107e88d905348995d42fbbc523bd29028defd1d8c6e0b94db87d44d5bbd4fe9cebf635f"

RPROVIDES:${PN} += "libpipewire-0-3-0 \
libpipewire-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
pipewire-modules-0-3 \
pipewire-spa-plugins-0-2"

inherit rpm
