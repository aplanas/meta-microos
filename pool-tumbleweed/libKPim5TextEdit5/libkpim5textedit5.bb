SUMMARY = "KDE PIM Libraries: Text editing functionality"
DESCRIPTION = "This package provides text editing functionality for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5TextEdit5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "16997415854ca20e2c1cf5a1fbed47f54277905e2c7fc0dcfd17c8c2f02a74c1a3a6eb59df5e3ce1b12016d497ad729d46644f9fc3025495c645d50521e2adf2"

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
libKF5TextEmoticonsWidgets.so.1 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
