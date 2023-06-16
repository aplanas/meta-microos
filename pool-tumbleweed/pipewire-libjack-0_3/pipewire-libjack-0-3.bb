SUMMARY = "PipeWire libjack replacement libraries"
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
This package provides the PipeWire replacement libraries for libjack."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-libjack-0_3-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "b87bfbccb990697c8db743c73accfde875bf7eac0651c691f13e0f7a506cdc71df764e8941cfebf84c0732517836c3d2d2f08d3b2a9832f4809a6362c21b309a"

RPROVIDES:${PN} += "libjack.so.0 \
libjacknet.so.0 \
libjackserver.so.0 \
pipewire-libjack-0-3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpipewire-0.3.so.0 \
update-alternatives"

inherit rpm
