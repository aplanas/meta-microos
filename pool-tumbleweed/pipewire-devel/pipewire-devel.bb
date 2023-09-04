SUMMARY = "Development Files For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides all the necessary files for development with PipeWire"
LICENSE = "MIT"

PV = "0.3.77"

RPM_NAME = "pipewire-devel-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "8c49cfe689796eeb4516a9e7c023db5e95700b3668cc61e8c9a45c90b6fe147cc9d669e466ae15f38a5549c31a2691bc2d6833bdf506e127b2e19e1ce7e1c8bc"

RPROVIDES:${PN} += "pipewire-devel \
pkgconfig-libpipewire-0.3 \
pkgconfig-libspa-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpipewire-0-3-0 \
pkgconfig-libspa-0.2"

inherit rpm
