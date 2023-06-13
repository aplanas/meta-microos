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

PV = "0.3.71"

RPM_NAME = "libpipewire-0_3-0-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "0e507287072046c181d5079d8d6a6fd53299731a79f459f51a00ff4d8818a594cc553eb0a1bbf1389844b286e632b5d41cef2c14b1fef74dda84f6d4e3f56863"

RPROVIDES:${PN} += "libpipewire-0.3.so.0()(64bit) \
libpipewire-0_3-0 \
libpipewire-0_3-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
pipewire-modules-0_3 \
pipewire-spa-plugins-0_2"

inherit rpm
