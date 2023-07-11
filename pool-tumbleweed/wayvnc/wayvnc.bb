SUMMARY = "A VNC server for wlroots based Wayland compositors"
DESCRIPTION = "This is a VNC server for wlroots based Wayland compositors. \
It attaches to a running Wayland session, creates virtual input devices and exposes a single display via the RFB protocol. \
The Wayland session may be a headless one, so it is also possible to run wayvnc without a physical display attached."
LICENSE = "ISC"

PV = "0.6.2"

RPM_NAME = "wayvnc-0.6.2-2.1.aarch64.rpm"
RPM_HASH = "1f04908e633523c77c361fd3b1cf82c951561038de0c306906704640f87c1e8a42fede52396456d414ab8ee1b7b4286911026c12e937e722693c14c050923f44"

RPROVIDES:${PN} += "wayvnc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaml.so.0 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libjansson.so.4 \
libm.so.6 \
libneatvnc.so.0 \
libpam.so.0 \
libpixman-1.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
