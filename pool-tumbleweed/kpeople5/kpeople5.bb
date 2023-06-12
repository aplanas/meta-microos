SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kpeople5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d4a793f795fd8fb17591112483551ed938c9282d20bdbd6e1e00c79abfbe0bc5b564fbcc5675d715b2effa2b7ad3c84805e79f0d6a970b5ea8b5ecf8c2e01e89"

RPROVIDES:${PN} += "kpeople5 \
kpeople5(aarch-64) \
libKF5People.so.5()(64bit) \
libKF5PeopleBackend.so.5()(64bit) \
libKF5PeopleDeclarative.so()(64bit) \
libKF5PeopleWidgets.so.5()(64bit) \
qt5qmlimport(org.kde.people.1)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
