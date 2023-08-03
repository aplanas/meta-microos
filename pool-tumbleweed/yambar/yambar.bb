SUMMARY = "Modular statusbar for X11 and Wayland"
DESCRIPTION = "Simplistic and highly configurable status panel for X and Wayland."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "yambar-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "aaeb04e4dea53e04fd030b8294fe85999d8f00d90691cb8b0c8b612c9382705f7bf0de246a51dc71563fe212278bfda20981667870c35103406bb746b2c1f4b1"

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
