SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. This package \
provides support to use KItemModels with the QtQuick framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kitemmodels-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "92968ca97fc2379dc24e93854ec7f3f6bd1b56f1cc95c4b2d043108f0ae151508c563a6773c8774126402adb250aabe0ed44ba8e6113d94ce2fa753bb688e0d7"

RPROVIDES:${PN} += "kitemmodels-imports \
libitemmodelsplugin.so \
qt5qmlimport-org.kde.kitemmodels.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ItemModels.so.5 \
libKF5ItemModels5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
