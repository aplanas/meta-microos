SUMMARY = "Window manager for Wayland compatible with i3"
DESCRIPTION = "'SirCmpwn's Wayland window manager' is a work in progress i3-compatible window \
manager for Wayland."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "sway-1.8.1-2.1.aarch64.rpm"
RPM_HASH = "2560281d8e86252bf11ba0a0df0cc6b04934aac5d88664a15e452f6b3df21a3bccb676f39492de601d22dce8f17447550e0908f595aadf6ce542b9c835a3a5c7"

RPROVIDES:${PN} += "sway \
sway(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libinput.so.10()(64bit) \
libjson-c.so.5()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libpixman-1.so.0()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libwayland-server.so.0()(64bit) \
libwlroots.so.11()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
sway-branding \
xdg-desktop-portal-wlr"

inherit rpm
