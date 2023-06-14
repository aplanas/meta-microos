SUMMARY = "Generic map viewer: Shared Library"
DESCRIPTION = "The shared library for the MarbleWidget shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libmarblewidget-qt5-28-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "1e478d96f682dcbe859d402b40d5c3e1acaac5a30100ebc8212bb9e5695667dfceaa618f8f5955b3ae8daba39097730864275451966535953eecc7ecdd75de3d"

RPROVIDES:${PN} += "libmarblewidget-qt5-28 \
libmarblewidget-qt5.so.28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libastro.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
