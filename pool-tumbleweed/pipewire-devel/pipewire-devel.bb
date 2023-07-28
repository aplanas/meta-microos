SUMMARY = "Development Files For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
This package provides all the necessary files for development with PipeWire"
LICENSE = "MIT"

PV = "0.3.74"

RPM_NAME = "pipewire-devel-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "1cac4b05be595caa4c88110c5d67cde280c2e95b3934b90ba663c2b6538ce06a333073cbd890bd063b94b6927dca28c9701ffb41e5bc9f91e46cc86718e00984"

RPROVIDES:${PN} += "pipewire-devel \
pkgconfig-libpipewire-0.3 \
pkgconfig-libspa-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpipewire-0-3-0 \
pkgconfig-libspa-0.2"

inherit rpm
