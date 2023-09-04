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

PV = "0.3.77"

RPM_NAME = "pipewire-libjack-0_3-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "9b42bc47d83111c0022b411d0d46256dd8c02216417c754e634233e39b112a3b455fe0cd997e6f27fc1f9fd56a301dcc850c9ca178f6469ee63e5f036543c720"

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
