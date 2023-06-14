SUMMARY = "A note taking application using Akonadi"
DESCRIPTION = "This package contains KJOTS, a note taking application using Akonadi."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.1"

RPM_NAME = "kjots-5.1.1-1.1.aarch64.rpm"
RPM_HASH = "784980f7b75212c7fb0a987dd68f5371ad4ff748ab681e0fcd773d2a669174505df159f3ba76110b2e3681f8a602a99750c9a035e1b01117ce033ed0fc5677f1"

RPROVIDES:${PN} += "kjots"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5Bookmarks.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5KIOGui.so.5 \
libKF5Parts.so.5 \
libKF5TextEditTextToSpeech.so.1 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiNotes.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5KontactInterface.so.5 \
libKPim5Mime.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
