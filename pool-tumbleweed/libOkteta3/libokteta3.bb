SUMMARY = "Hex editor/viewer QWidgets libraries"
DESCRIPTION = "Okteta libraries for QWidget-based hex editing widgets."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.12"

RPM_NAME = "libOkteta3-0.26.12-1.1.aarch64.rpm"
RPM_HASH = "1a474b8b494a5c67c5ac9d7325171651f00be83f634e0f729dd51d2bfb972bd8896ebb88294f1a12d133bf828d77c002abf4cf1e3066e68421a42441435dc4c5"

RPROVIDES:${PN} += "libOkteta3 \
libOkteta3Core.so.0 \
libOkteta3Gui.so.0 \
libokteta"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
