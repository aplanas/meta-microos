SUMMARY = "Dynamic menu library and client program inspired by dmenu"
DESCRIPTION = "Dynamic menu library and client program inspired by dmenu with support \
for X, Wayland and ncurses."
LICENSE = "MIT"

PV = "0.6.16"

RPM_NAME = "bemenu-0.6.16-1.1.aarch64.rpm"
RPM_HASH = "3c1eec37dd227dc93b8fb374a0d3be2c9840c46e674f60387704676da19e0dac9d8b4feea88d61b7678999c2afb7a5e4a6a1f2362e8914ea768f570005b60d94"

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
