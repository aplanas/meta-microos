SUMMARY = "Modular statusbar for X11 and Wayland"
DESCRIPTION = "Simplistic and highly configurable status panel for X and Wayland."
LICENSE = "MIT"

PV = "1.9.0+g34"

RPM_NAME = "yambar-1.9.0+g34-1.3.aarch64.rpm"
RPM_HASH = "178f6e80d51deaedd8f63798f112f63c7c5aaca32e01aa9097a66532b624b98f35f062f16ea8c50de89239fff867c9919f18321dc49da25ee2bbad9d41151c13"

RPROVIDES:${PN} += "yambar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfcft.so.4 \
libjson-c.so.5 \
libm.so.6 \
libmpdclient.so.2 \
libpipewire-0.3.so.0 \
libpixman-1.so.0 \
libpulse.so.0 \
libudev.so.1 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxcb-cursor.so.0 \
libxcb-errors.so.0 \
libxcb-randr.so.0 \
libxcb-render.so.0 \
libxcb-util.so.1 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libyaml-0.so.2"

inherit rpm
