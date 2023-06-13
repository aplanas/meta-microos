SUMMARY = "Development Files For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides all the necessary files for development with PipeWire"
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-devel-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "3d013a24177f603d8a9b6a32e7bfd051727f57cc5dd9897e71a7f4afd5e9abecf13ca85db87d0eaa48b965f8f3cfde46cbb423d71d3c1b4a387dcc72c40f906b"

RPROVIDES:${PN} += "pipewire-devel \
pipewire-devel(aarch-64) \
pkgconfig(libpipewire-0.3) \
pkgconfig(libspa-0.2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpipewire-0_3-0 \
pkgconfig(libspa-0.2)"

inherit rpm
