SUMMARY = "QtQuick bindings for classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. This package provides QtQuick bindings \
for the KCMUtils libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kcmutils-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "832b56795f7ff99c4a8452af656dbc1ae644d6783dcdfc52d76dc92587ecb373c6823e45dfaa6a149cdbde547db8dc88378f28d201755e74778e671691efaf19"

RPROVIDES:${PN} += "kcmutils-imports \
libkcmutilsqmlplugin.so \
qt5qmlimport-org.kde.kcmutils.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ItemViews.so.5 \
libKF5KCMUtils5 \
libKF5KCMUtilsCore5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2"

inherit rpm
