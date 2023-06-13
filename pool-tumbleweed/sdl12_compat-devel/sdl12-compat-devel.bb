SUMMARY = "Libraries, includes and more to develop SDL-1.2 applications"
DESCRIPTION = "This package contains files needed for development with the SDL \
library."
LICENSE = "MIT"

PV = "1.2.64"

RPM_NAME = "sdl12_compat-devel-1.2.64-1.1.aarch64.rpm"
RPM_HASH = "7ba8bb60026779bd775779c4acdce1abd234575c21072163882d5ab61c9ed18151439c260413f69fbad889e28ff60552fd75526112d9dec2c10c2599121f2a41"

RPROVIDES:${PN} += "SDL-devel \
libSDL-devel \
pkgconfig(sdl) \
pkgconfig(sdl12_compat) \
sdl12_compat-devel \
sdl12_compat-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libSDL-1_2-0 \
pkgconfig(gl) \
pkgconfig(glu) \
pkgconfig(x11) \
pkgconfig(xproto)"

inherit rpm
