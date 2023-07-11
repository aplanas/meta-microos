SUMMARY = "Hex editor/viewer QWidgets libraries"
DESCRIPTION = "Okteta libraries for QWidget-based hex editing widgets."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.11"

RPM_NAME = "libOkteta3-0.26.11-1.1.aarch64.rpm"
RPM_HASH = "df3eaca624759d36ef05f021105482fceee88cf926d242ec205c2570a814df44673706a06d69d94be258fe649e418b572684dcd6736e54f4adc7d019a40397a6"

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
