SUMMARY = "Qt browser for journald database"
DESCRIPTION = "This project aims to provide an abstraction of the systemd’s journald API in \
terms of QAbstractItemModel classes. The main purpose is to ease the \
integration of journald into Qt based applications (both QML and QtWidget). \
Additional to the library, the project provides a reference implementation of \
the API, called kjournaldbrowser. Even though that application provides a \
powerful journal database reader, we aim to do a clear split between \
reuseable library and application logic."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kjournald-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f9c4803013bcb31d9146324e0866dc3f5e107e54cb74d574fcc40cc32649a239c11a990edb514c92af0c86d8b0c277a4707dc36b4a0f0c6559b48a7f769a1535"

RPROVIDES:${PN} += "kjournald \
libkjournald.so.23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
