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

PV = "0.3.76"

RPM_NAME = "libpipewire-0_3-0-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "f8c2b5b29981854290c48abba93c20702b3c0019c71261e077dced69a947ee2b2107f561c4db724e3a805912a3b385a4b6ac6c3a911a793cb4d6b914ffdc56e5"

RPROVIDES:${PN} += "libpipewire-0-3-0 \
libpipewire-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
pipewire-modules-0-3 \
pipewire-spa-plugins-0-2"

inherit rpm
