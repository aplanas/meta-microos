SUMMARY = "Text grammar checking"
DESCRIPTION = "This package provides a library for automated grammar checking."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libKF5TextGrammarCheck1-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "ef4d263450f442a47f71de6c2cd05a385128e3f8d303f5f7ba8777a653953a7bb181267a9cd36d7c96d5febc53a81500f2ab9665cc6ff6e8de1fed23efd286cb"

RPROVIDES:${PN} += "libKF5TextGrammarCheck.so.1 \
libKF5TextGrammarCheck1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
