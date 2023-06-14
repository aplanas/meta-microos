SUMMARY = "The best way for reading your comics"
DESCRIPTION = "A cross platform comic reader and library manager."
LICENSE = "GPL-3.0-or-later"

PV = "9.11.0"

RPM_NAME = "yacreader-9.11.0-1.3.aarch64.rpm"
RPM_HASH = "2d1862a1407fd0669f18e2f47b00dbbe3cd2f3a5f062fbdf509ada186d7ed02cc5dd0a38f6886bbc68330e30268161c921f5f2df4cae9316d1ae657b8c0c8a38"

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
