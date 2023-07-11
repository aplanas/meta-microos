SUMMARY = "Classic single screen vertical shoot em up SDL"
DESCRIPTION = "XGalaga-SDL is a port of the popular X11 game XGalaga, \
a clone of Galaga, using the SDL library. \
XGalaga was originally written by Joe Rumsey."
LICENSE = "GPL-2.0+"

PV = "2.1.1.0"

RPM_NAME = "xgalaga-sdl-2.1.1.0-1.27.aarch64.rpm"
RPM_HASH = "96b82436a8cb3d43262b045163b20f5bf93828522c4387148fd3683b161b4cdb8e0b2dc1972812ebe1a2e84ac263eca6d2b92ff904f3c262ab2a557bef318e79"

RPROVIDES:${PN} += "xgalaga-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-gfx.so.15 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6"

inherit rpm
