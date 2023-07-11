SUMMARY = "Stand-alone compositor for X11"
DESCRIPTION = "Picom is a stand-alone compositor for X11. It supports both GLX and \
XRender backends and has various options to control shadows, blur \
and fade animations."
LICENSE = "MIT & MPL-2.0"

PV = "10.2"

RPM_NAME = "picom-10.2-1.4.aarch64.rpm"
RPM_HASH = "41685a4a3ec6e7f038387ed0f8c8efb1ed3358ae296b5fd21fa5b744ba916baf227d74d9190259cb683dbe91e4caefa68df25d9b73ebe02d885aeee68b5e1061"

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
