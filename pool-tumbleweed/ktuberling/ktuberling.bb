SUMMARY = "Potato drawing editor"
DESCRIPTION = "KTuberling is a nice potato editor for kids. The game intended for \
small children. Of course, it may be suitable for adults who have \
remained young at heart. Eyes, mouths, mustache, and other parts of \
face and goodies can be attached onto a potato-like guy."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktuberling-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "515fb0ee0f7f6016a0ede482d147b1d90196ed48a7b7588b5228d72b04702208449edae0c6b0fa65b279ff827f503aadf7c0718c3c0338c1a5c505f8634a2817"

RPROVIDES:${PN} += "application() \
application(org.kde.ktuberling.desktop) \
ktuberling \
ktuberling(aarch-64) \
ktuberling5 \
metainfo() \
metainfo(org.kde.ktuberling.appdata.xml) \
mimehandler(application/x-tuberling)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
