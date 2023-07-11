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

PV = "0.3.72"

RPM_NAME = "libpipewire-0_3-0-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "f95c67aa96f1152db94281e5eb07346bd32f19d10847189d97f68612c6cc8b18e549e50c5bd1d94ac1352a5174a331869e0df34713e93a2970271f6fa5c0e466"

RPROVIDES:${PN} += "libpipewire-0-3-0 \
libpipewire-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
pipewire-modules-0-3 \
pipewire-spa-plugins-0-2"

inherit rpm
