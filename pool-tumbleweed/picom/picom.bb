SUMMARY = "Stand-alone compositor for X11"
DESCRIPTION = "Picom is a stand-alone compositor for X11. It supports both GLX and \
XRender backends and has various options to control shadows, blur \
and fade animations."
LICENSE = "MIT & MPL-2.0"

PV = "10.2"

RPM_NAME = "picom-10.2-1.3.aarch64.rpm"
RPM_HASH = "a979e9067f0c4751dd56618b302b022c4933d51a22621f35fe034ae497801058329d298952c67b1580826f1f0205bee7139747f1eb1f037bceb0af97a9c0b802"

RPROVIDES:${PN} += "compton \
config-picom \
picom"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libconfig.so.11 \
libdbus-1.so.3 \
libev.so.4 \
libm.so.6 \
libpcre.so.1 \
libpixman-1.so.0 \
libxcb-composite.so.0 \
libxcb-damage.so.0 \
libxcb-glx.so.0 \
libxcb-image.so.0 \
libxcb-present.so.0 \
libxcb-randr.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb-xinerama.so.0 \
libxcb.so.1"

inherit rpm
