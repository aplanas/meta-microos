SUMMARY = "QtQuick bindings for classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. This package provides QtQuick bindings \
for the KCMUtils libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kcmutils-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "8c3c29fe3e4bc10e2d05df404e2c3dca34f863ec49658f02959b98260783548fa268e2cb7fc0409cf0013b116e461bd8abab771be6c4dd5ec153de1456ece055"

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
