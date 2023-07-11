SUMMARY = "Generic map viewer: Shared Library"
DESCRIPTION = "The shared library for the MarbleWidget shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libmarblewidget-qt5-28-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "61814f6a6f25b7cd0793af83e601501e807c886da929cdbf7718d8d194ddf64c62bccff4630edc1dc92b4c585f713e740429dce8d8d372783143e961ea0272e6"

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
