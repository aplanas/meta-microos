SUMMARY = "An xdg-desktop-portal backend for wlroots"
DESCRIPTION = "xdg-desktop-portal backend for wlroots. \
 \
Make sure the `XDG_CURRENT_DESKTOP` env var is set in the D-Bus user session \
to one of the UseIn values in wlr.portal"
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "xdg-desktop-portal-wlr-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "9c3ba13411f2e6e2a2a14ca4288433db05d4f126a4d159b66c67a230a4e2eb3c7eab1a0506dfb7bea1e1b9bd47341d8586b81265997ffe38d12ce488d96707b5"

RPROVIDES:${PN} += "xdg-desktop-portal-wlr \
xdg-desktop-portal-wlr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libgbm.so.1()(64bit) \
libinih.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit) \
libwayland-client.so.0()(64bit) \
xdg-desktop-portal"

inherit rpm
