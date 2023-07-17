SUMMARY = "Window manager for Wayland compatible with i3"
DESCRIPTION = "'SirCmpwn's Wayland window manager' is a work in progress i3-compatible window \
manager for Wayland."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "sway-1.8.1-3.1.aarch64.rpm"
RPM_HASH = "b8bbf4c37ca92a95ff5b73493f3499a014d5104045c75bd0ff355b9d84a0594009d373eaa4d3733074881c397e926f3031a25a86d8c209720c5faeba88e875c4"

RPROVIDES:${PN} += "sway"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libcairo.so.2 \
libevdev.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libinput.so.10 \
libjson-c.so.5 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpcre2-8.so.0 \
libpixman-1.so.0 \
libudev.so.1 \
libwayland-server.so.0 \
libwlroots.so.11 \
libxcb-icccm.so.4 \
libxcb.so.1 \
libxkbcommon.so.0 \
sway-branding"

inherit rpm
