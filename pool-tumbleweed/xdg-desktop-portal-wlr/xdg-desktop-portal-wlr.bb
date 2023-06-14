SUMMARY = "An xdg-desktop-portal backend for wlroots"
DESCRIPTION = "xdg-desktop-portal backend for wlroots. \
 \
Make sure the `XDG_CURRENT_DESKTOP` env var is set in the D-Bus user session \
to one of the UseIn values in wlr.portal"
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "xdg-desktop-portal-wlr-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "9c3ba13411f2e6e2a2a14ca4288433db05d4f126a4d159b66c67a230a4e2eb3c7eab1a0506dfb7bea1e1b9bd47341d8586b81265997ffe38d12ce488d96707b5"

RPROVIDES:${PN} += "xdg-desktop-portal-wlr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libinih.so.0 \
libpipewire-0.3.so.0 \
libsystemd.so.0 \
libwayland-client.so.0 \
xdg-desktop-portal"

inherit rpm
