SUMMARY = "Adjusts the color temperature of your screen according to time of day"
DESCRIPTION = "Gammastep adjusts the color temperature of your screen according to your \
surroundings. This may help your eyes hurt less if you are working in front \
of the screen at night. \
 \
The color temperature is set according to the position of the sun. A different \
color temperature is set during night and daytime. During twilight and early \
morning, the color temperature transitions smoothly from night to daytime \
temperature to allow your eyes to slowly adapt. \
 \
Gammastep supports wlr-gamma-control-unstable-v1 protocol for wlroots-based \
wayland compositors."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.9"

RPM_NAME = "gammastep-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "e9a1d7c79e225e2fbc9b27bbcd7ce0b690efcdcd46df9cd76211c148b39393ebcf15c01b5e5f5bc503acd24250741f89a6e44686a2d47061e8e38b584f0959dc"

RPROVIDES:${PN} += "gammastep"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXxf86vm.so.1 \
libc.so.6 \
libdrm.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libwayland-client.so.0 \
libxcb-randr.so.0 \
libxcb.so.1"

inherit rpm
