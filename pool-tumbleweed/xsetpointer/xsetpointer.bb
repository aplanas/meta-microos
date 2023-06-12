SUMMARY = "Utility to set an X Input device as the main pointer"
DESCRIPTION = "Xsetpointer sets an XInput device as the main pointer."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xsetpointer-1.0.1-9.27.aarch64.rpm"
RPM_HASH = "619dbc4a4cde175b3f128849b9f5cb4bb38578ef69984d1f5ab754daff62437cc2bc95b67811f89681d7f329af9f2bd11bf842bb2439b290f0a8faabe55c2f74"

RPROVIDES:${PN} += "xsetpointer \
xsetpointer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm