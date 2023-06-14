SUMMARY = "A fast and easy-to-use status bar"
DESCRIPTION = "A fast and easy-to-use status bar for tilling WM"
LICENSE = "MIT"

PV = "3.6.3"

RPM_NAME = "polybar-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "8bf165e84a9ab6fa2d9582670c30ff48a7193ffcfc585a22e2922e9162efca2ab406780c1707529631f0abfa54e40f2ce4e79ac5d1e4a3c7e51d323b71b0574e"

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
