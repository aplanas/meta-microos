SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. This package \
provides support to use KItemModels with the QtQuick framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kitemmodels-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "6d7164e765522ecf7764e61bcd5917867652144e6c62c521eb544a9b7dc5285af8d5811c49c3e99b94cc729c478d3391b8cae812585625c58e7a3b2557d3a706"

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
