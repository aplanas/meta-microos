SUMMARY = "Classic single screen vertical shoot em up SDL"
DESCRIPTION = "XGalaga-SDL is a port of the popular X11 game XGalaga, \
a clone of Galaga, using the SDL library. \
XGalaga was originally written by Joe Rumsey."
LICENSE = "GPL-2.0+"

PV = "2.1.1.0"

RPM_NAME = "xgalaga-sdl-2.1.1.0-1.26.aarch64.rpm"
RPM_HASH = "9c69b7e949291bdbf8ebed3374fe792923d3ad79c30957afe7180bc4ce8983be4529328298709fba4563224823a8610daad0e3e53917f96145f8122315de5f07"

RPROVIDES:${PN} += "xgalaga-sdl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libSDL-gfx.so.15 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libSDL-ttf-2.0.so.0 \
libc.so.6"

inherit rpm
