SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kpeople5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "7074190137731e4f7cb8969a53983403057a1fae3d6c3782ac002099db1aac84178d8e871a42d9f2aef10c7e39035a305b3dacf649c0456d8b035dfeae5e7268"

RPROVIDES:${PN} += "kpeople5 \
libKF5People.so.5 \
libKF5PeopleBackend.so.5 \
libKF5PeopleDeclarative.so \
libKF5PeopleWidgets.so.5 \
qt5qmlimport-org.kde.people.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
