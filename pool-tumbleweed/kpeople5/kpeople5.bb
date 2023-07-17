SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kpeople5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "c5b9fbe373f3891996085091bca5516bb95a93af61fa3568db08fff036ed5b8d90cfc5b2714f6c2986e445f7c22ac56bd5e71c75c7efb0590f07b61cdbb29090"

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
