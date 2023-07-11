SUMMARY = "KDE PIM Libraries: Text editing functionality"
DESCRIPTION = "This package provides text editing functionality for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5TextEdit5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "34c2dff786a9f8b340eed5a49a5fc379571af4de135f81d871be838ff530b2f079d5a63941efb8063bf87508f4deb2e5ca8dc2a18d7b78f8127fe1e56354a8ac"

RPROVIDES:${PN} += "libKPim5TextEdit.so.5 \
libKPim5TextEdit5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kpimtextedit \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextEditTextToSpeech.so.1 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
