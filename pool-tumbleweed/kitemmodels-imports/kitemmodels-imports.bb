SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. This package \
provides support to use KItemModels with the QtQuick framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kitemmodels-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "a576264ba1be6ddc1ac51cb5a2cf4d3fb1812ec6a26121526ae3bef6b973fe0597921e012832953ed981a0246c4c65d4131438c288a6fe5c6809e2ddf76e6352"

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
