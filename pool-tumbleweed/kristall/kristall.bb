SUMMARY = "Graphical small-internet client"
DESCRIPTION = "Graphical small-internet client supporting gemini, http, https, gopher, finger."
LICENSE = "GPL-3.0-or-later"

PV = "0.4"

RPM_NAME = "kristall-0.4-1.1.aarch64.rpm"
RPM_HASH = "8e1945105b7fca08c35115412ea1b414c2cc16e768910c042eea5a77cd6b91e5be2da487a8a2c7a809513a9eec83c5ebb447102d2649891385f581fceed019b2"

RPROVIDES:${PN} += "kristall"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
