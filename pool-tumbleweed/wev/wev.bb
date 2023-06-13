SUMMARY = "Wayland event viewer"
DESCRIPTION = "This is a tool for debugging events on a Wayland window, analagous to \
the X11 tool xev."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "wev-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "c6b15440f89395058964e87b2b75bf141ba3895226a7ba9930bd38629f31ca98b54a447e502c982183a3fc1b4578a0840617187f99960a6399a41496a45b8b6c"

RPROVIDES:${PN} += "wev \
wev(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libwayland-client.so.0()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
