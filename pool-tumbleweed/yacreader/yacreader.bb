SUMMARY = "The best way for reading your comics"
DESCRIPTION = "A cross platform comic reader and library manager."
LICENSE = "GPL-3.0-or-later"

PV = "9.13.1"

RPM_NAME = "yacreader-9.13.1-1.1.aarch64.rpm"
RPM_HASH = "36ae1a721c4516727181293f359052c99dfd65ebfb148b78b1183b54d610e84983669396c1079bda23f93935f056d0abf0aa9a7d7a80b4c7cfb3a026e817b5c1"

RPROVIDES:${PN} += "yacreader"

RDEPENDS:${PN} += "hicolor-icon-theme \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-qt5.so.1 \
libstdc++.so.6"

inherit rpm
