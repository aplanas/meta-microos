SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "knewstuff-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "e0d57ce702d6653dc78c1f2af92d69ddbf0bf171d390a85308c98a89f60189f2d2c7fe8fa1aa7780982b614a7efba9d411d75d59a0b0a03378010c3f5a2bb29a"

RPROVIDES:${PN} += "application() \
application(org.kde.knewstuff-dialog.desktop) \
knewstuff \
knewstuff(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
