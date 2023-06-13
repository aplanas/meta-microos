SUMMARY = "Library for handling xkb descriptions using XKB-X11"
DESCRIPTION = "An addon library that supports creating keymaps with the XKB X11 \
protocol by querying the X server directly."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbcommon-x11-0-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "993414611e0ca3d2d39db3a1568a2fd3fbfc10802a10d587e3119bba1ef26db358448f17610e9544b1bf4925630300cb1c06e310bf07b56121847f10e28b6b9a"

RPROVIDES:${PN} += "libxkbcommon-x11-0 \
libxkbcommon-x11-0(aarch-64) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon-x11.so.0(V_0.5.0)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
