SUMMARY = "A note taking application using Akonadi"
DESCRIPTION = "This package contains KJOTS, a note taking application using Akonadi."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.1"

RPM_NAME = "kjots-5.1.1-1.1.aarch64.rpm"
RPM_HASH = "784980f7b75212c7fb0a987dd68f5371ad4ff748ab681e0fcd773d2a669174505df159f3ba76110b2e3681f8a602a99750c9a035e1b01117ce033ed0fc5677f1"

RPROVIDES:${PN} += "application() \
application(org.kde.kjots.desktop) \
kjots \
kjots(aarch-64) \
metainfo() \
metainfo(org.kde.kjots.appdata.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGrantlee_Templates.so.5()(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5TextEditTextToSpeech.so.1()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiNotes.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5KontactInterface.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libKPim5TextEdit.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
