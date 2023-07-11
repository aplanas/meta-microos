SUMMARY = "An xdg-desktop-portal backend for wlroots"
DESCRIPTION = "xdg-desktop-portal backend for wlroots. \
 \
Make sure the `XDG_CURRENT_DESKTOP` env var is set in the D-Bus user session \
to one of the UseIn values in wlr.portal"
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "xdg-desktop-portal-wlr-0.7.0-1.2.aarch64.rpm"
RPM_HASH = "bc354ffa329c0f7ac14c46b3cf2222e2e46c90a9aedb5256946ad42d5ab4425f18d570a09ad599efb432dd925c86c137cb02b317baa80e4865f7599de7c37f31"

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
