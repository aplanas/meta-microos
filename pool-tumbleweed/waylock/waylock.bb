SUMMARY = "Small screenlocker for Wayland compositors"
DESCRIPTION = "Screenlocker for Wayland compositors implementing ext-session-lock-v1. \
(The v1 protocol is robust in that a crashing locker does not \
cause the session to be unlocked.)"
LICENSE = "ISC"

PV = "0.6.2"

RPM_NAME = "waylock-0.6.2-1.3.aarch64.rpm"
RPM_HASH = "f66e76980c4979e30ed364dae2bb323dc4eea188de5cf102846a40a2c99316efa410d1ea7433fe22a164905a3318e6fb9ec727890442c14ca77c87286e884c32"

RPROVIDES:${PN} += "waylock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
