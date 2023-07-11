SUMMARY = "A Qt GUI for Google, Yandex and Bing translators"
DESCRIPTION = "A simple and lightweight translator that allows to translate and speak \
text using Google, Yandex and Bing written with Qt5."
LICENSE = "GPL-3.0-only"

PV = "2.10.0"

RPM_NAME = "crow-translate-2.10.0-1.5.aarch64.rpm"
RPM_HASH = "742695cf3f135834595a0661367536af382c4b785e5a581537534f053fdb8c9d5646ae816b401378a84d4df0076db136fee9a87a20fb51be51e199cbdbd145c8"

RPROVIDES:${PN} += "crow-translate"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libKF5WaylandClient.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtesseract.so.5 \
libxcb.so.1"

inherit rpm
