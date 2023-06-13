SUMMARY = "A fast and easy-to-use status bar"
DESCRIPTION = "A fast and easy-to-use status bar for tilling WM"
LICENSE = "MIT"

PV = "3.6.3"

RPM_NAME = "polybar-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "8bf165e84a9ab6fa2d9582670c30ff48a7193ffcfc585a22e2922e9162efca2ab406780c1707529631f0abfa54e40f2ce4e79ac5d1e4a3c7e51d323b71b0574e"

RPROVIDES:${PN} += "polybar \
polybar(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcurl.so.4()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjsoncpp.so.25()(64bit) \
libm.so.6()(64bit) \
libmpdclient.so.2()(64bit) \
libmpdclient.so.2(libmpdclient2)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libuv.so.1()(64bit) \
libxcb-composite.so.0()(64bit) \
libxcb-cursor.so.0()(64bit) \
libxcb-ewmh.so.2()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb-xrm.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
