SUMMARY = "Development Files For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides all the necessary files for development with PipeWire"
LICENSE = "MIT"

PV = "0.3.72"

RPM_NAME = "pipewire-devel-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "a925cce700f31a3d264f30f060fec26d286a730236a195092a2243f1fe697f35a216869f2b23b3f9be5fb9f386814d6ad9270918c9793363ca821f2a5688c7bb"

RPROVIDES:${PN} += "pipewire-devel \
pkgconfig-libpipewire-0.3 \
pkgconfig-libspa-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpipewire-0-3-0 \
pkgconfig-libspa-0.2"

inherit rpm
