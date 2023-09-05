SUMMARY = "Development Files For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides all the necessary files for development with PipeWire"
LICENSE = "MIT"

PV = "0.3.79"

RPM_NAME = "pipewire-devel-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "575b0f5dec6eb78030ff3fcff64c4ca8a9075be4dfbcd8e0e3514022ce15dbb5940d5a93879250139870ca0c66c52f82a7350fff180165b9d1b58ede8a2a7768"

RPROVIDES:${PN} += "pipewire-devel \
pkgconfig-libpipewire-0.3 \
pkgconfig-libspa-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpipewire-0-3-0 \
pkgconfig-libspa-0.2"

inherit rpm
