SUMMARY = "Development files for the SDL networking library"
DESCRIPTION = "This is a small cross-platform networking library for use with SDL."
LICENSE = "LGPL-2.1+"

PV = "1.2.8"

RPM_NAME = "libSDL_net-devel-1.2.8-7.26.aarch64.rpm"
RPM_HASH = "9be6c728cc1c6e3d769bdbdbb7826de147b14c9659c429598b33e49a20ef34e68e1d3d65c17ed7dccc14f96c207fc901a60eda67757516c70d9d25f9e3eb0a73"

RPROVIDES:${PN} += "SDL-net-devel \
libSDL-net-devel \
pkgconfig-SDL-net"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSDL-net-1-2-0 \
pkgconfig-sdl"

inherit rpm
