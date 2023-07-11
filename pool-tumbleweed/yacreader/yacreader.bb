SUMMARY = "The best way for reading your comics"
DESCRIPTION = "A cross platform comic reader and library manager."
LICENSE = "GPL-3.0-or-later"

PV = "9.11.0"

RPM_NAME = "yacreader-9.11.0-1.4.aarch64.rpm"
RPM_HASH = "0388728a0d343908a617989020424af98a220590d6a1eaab44ad75922998d403f81e94528d472e6d1191f6ff419197e61b98ae93b1dbf42ea12660b6f8444fef"

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
