SUMMARY = "Virtual/offscreen frame buffer video driver for the Xorg X server"
DESCRIPTION = "dummy is an Xorg driver for virtual/offscreen frame buffer."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "xf86-video-dummy-0.4.1-1.1.aarch64.rpm"
RPM_HASH = "2646b4eb7787ec7a1d4ee8eb19144dfbae1e2efb0bd72a5b3f9499a1b12b11eb5066f89ef8aee63fd6d882936bc7ddccc27e9e5f24f4e6b7309e364a57890973"

RPROVIDES:${PN} += "xf86-video-dummy \
xf86-video-dummy(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
