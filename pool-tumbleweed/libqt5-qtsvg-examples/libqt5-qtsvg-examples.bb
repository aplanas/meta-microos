SUMMARY = "Qt5 SVG examples"
DESCRIPTION = "Examples for the libqt5-qtsvg modules."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde8"

RPM_NAME = "libqt5-qtsvg-examples-5.15.10+kde8-1.1.aarch64.rpm"
RPM_HASH = "1949ba290b01019a02defbb3378997392a7767f926b303117daff9937dfeef2ee5464460ba6c5dea07ed1742c71e6645319af0986b49cd984a5f19515225cd5c"

RPROVIDES:${PN} += "libqt5-qtsvg-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
