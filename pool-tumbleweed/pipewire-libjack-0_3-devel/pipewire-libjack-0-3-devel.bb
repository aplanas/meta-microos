SUMMARY = "Development files for pipewire-libjack-0_3"
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
This package provides the PipeWire replacement development files \
for libjack."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-libjack-0_3-devel-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "02ae5c1bcf001cd70ed7fe0d9255a3c7c257eb1587a575ae6618594b68371a2e9057bc29976c2c72695705dc1b0d6e411f1a89ba873a52447b759d8ad93323d5"

RPROVIDES:${PN} += "pipewire-libjack-0_3-devel \
pipewire-libjack-0_3-devel(aarch-64) \
pkgconfig(jack)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pipewire-libjack-0_3"

inherit rpm
