SUMMARY = "Development Files For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides all the necessary files for development with PipeWire"
LICENSE = "MIT"

PV = "0.3.76"

RPM_NAME = "pipewire-devel-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "ee1edb6f85f857be69d00e3db3e0fc8ef28c82a839de8ef66e47a9b4fd7d3ebbbb619e41b13f280ff2d887a9ad128f6578eeb99de8dfca9a5d9eea599930e5c7"

RPROVIDES:${PN} += "pipewire-devel \
pkgconfig-libpipewire-0.3 \
pkgconfig-libspa-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpipewire-0-3-0 \
pkgconfig-libspa-0.2"

inherit rpm
