SUMMARY = "Dynamic menu library and client program inspired by dmenu"
DESCRIPTION = "Dynamic menu library and client program inspired by dmenu with support \
for X, Wayland and ncurses."
LICENSE = "MIT"

PV = "0.6.15"

RPM_NAME = "bemenu-0.6.15-1.1.aarch64.rpm"
RPM_HASH = "0ddfd54d2483111e3b2cd693f2d2de1155c67efa028373150e646e783ddb55cad14e7505907558e86fb74dfadcfbf2c217fc33464696abf13820ebb50fded1e0"

RPROVIDES:${PN} += "bemenu"

RDEPENDS:${PN} += "libX11.so.6 \
libXinerama.so.1 \
libbemenu.so.0 \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libncursesw.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libtinfo.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
