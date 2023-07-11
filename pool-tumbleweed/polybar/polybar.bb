SUMMARY = "A fast and easy-to-use status bar"
DESCRIPTION = "A fast and easy-to-use status bar for tilling WM"
LICENSE = "MIT"

PV = "3.6.3"

RPM_NAME = "polybar-3.6.3-2.2.aarch64.rpm"
RPM_HASH = "71e1ebc5c39dc706009ef8d1db24c9b9f53f48b602f7babe05900d8dc2f2d8d8b535157f12f1a4ad3ca6722c2a38bea32707bb14cff96fb8005dad1e40637e9c"

RPROVIDES:${PN} += "polybar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libm.so.6 \
libmpdclient.so.2 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpulse.so.0 \
libstdc++.so.6 \
libuv.so.1 \
libxcb-composite.so.0 \
libxcb-cursor.so.0 \
libxcb-ewmh.so.2 \
libxcb-icccm.so.4 \
libxcb-randr.so.0 \
libxcb-xkb.so.1 \
libxcb-xrm.so.0 \
libxcb.so.1"

inherit rpm
