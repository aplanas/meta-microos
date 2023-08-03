SUMMARY = "Dynamic menu library and client program inspired by dmenu"
DESCRIPTION = "Dynamic menu library and client program inspired by dmenu with support \
for X, Wayland and ncurses."
LICENSE = "MIT"

PV = "0.6.15"

RPM_NAME = "bemenu-0.6.15-1.2.aarch64.rpm"
RPM_HASH = "c85e197692ee86732bba31e16b420927b4330d5c1f160d7aeb717a684748b1fd7dc8abad8baa6ab4d70f58a75075842a68811c5e346c4f314d340c7265667b70"

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
