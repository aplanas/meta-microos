SUMMARY = "QtQuick bindings for classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. KCModules can be \
created with the KConfigWidgets framework. This package provides QtQuick bindings \
for the KCMUtils libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kcmutils-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "651ffe3c79be0ab883b274413c9ceff0ac61abfe711b07328dc9d18df24c52c9271d448e4f55036c7c60ecc0c2af30f6b0e7507c3639fd44020a01366b6f9943"

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
