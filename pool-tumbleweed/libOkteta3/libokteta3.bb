SUMMARY = "Hex editor/viewer QWidgets libraries"
DESCRIPTION = "Okteta libraries for QWidget-based hex editing widgets."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.10"

RPM_NAME = "libOkteta3-0.26.10-1.3.aarch64.rpm"
RPM_HASH = "05ec595ac800e78d56203d6990b7bb80cbb33cb5feb055c5c357fe4426e53a57ae579ffa32c510a6f3b9f9b0da24685cfb193549a6cba0e9e79b1bfb9c47ccfc"

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
