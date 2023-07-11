SUMMARY = "LXQt File Archiver"
DESCRIPTION = "LXQt file archiver."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "lxqt-archiver-0.8.0-1.2.aarch64.rpm"
RPM_HASH = "ba1fc53ac40fed232c0976b78b6af966cccf50d5a1fe9c556adc9a0963bd5a78aff606b26b2a5ccfcccbb205592c99e9d3c3b362b95462a569565ebc46f60d41"

RPROVIDES:${PN} += "lxqt-archiver"

RDEPENDS:${PN} += "bsdtar \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfm-qt.so.13 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libstdc++.so.6"

inherit rpm
