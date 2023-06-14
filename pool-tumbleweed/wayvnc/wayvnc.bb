SUMMARY = "A VNC server for wlroots based Wayland compositors"
DESCRIPTION = "This is a VNC server for wlroots based Wayland compositors. \
It attaches to a running Wayland session, creates virtual input devices and exposes a single display via the RFB protocol. \
The Wayland session may be a headless one, so it is also possible to run wayvnc without a physical display attached."
LICENSE = "ISC"

PV = "0.6.2"

RPM_NAME = "wayvnc-0.6.2-1.3.aarch64.rpm"
RPM_HASH = "e309d53fc8d53672e3ceeacf525486f59eefcc9236a3debb4b29a46013d61ccba69d70444ee0d6a91bf707864e5781d0806f32529066f8de5b5cc3e53aa26875"

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
