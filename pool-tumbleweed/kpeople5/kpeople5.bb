SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kpeople5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d4a793f795fd8fb17591112483551ed938c9282d20bdbd6e1e00c79abfbe0bc5b564fbcc5675d715b2effa2b7ad3c84805e79f0d6a970b5ea8b5ecf8c2e01e89"

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
