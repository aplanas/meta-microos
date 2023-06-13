SUMMARY = "A dynamic tiling Wayland compositor"
DESCRIPTION = "River is a dynamic tiling Wayland compositor with flexible runtime configuration."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g109"

RPM_NAME = "river-0.2.4+g109-3.1.aarch64.rpm"
RPM_HASH = "706b0fa9a4a51665d689a4b9ef48a64a39e778abd06bac7c3434a3ad493c9acae29132bab97bc6b4a13b674b45f00fe035ae48e99d10ce99879997d49a9fede7"

RPROVIDES:${PN} += "river \
river(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libinput.so.10()(64bit) \
libpixman-1.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
libwlroots.so.11()(64bit) \
libxkbcommon.so.0()(64bit) \
river-riverctl \
river-rivertile"

inherit rpm
