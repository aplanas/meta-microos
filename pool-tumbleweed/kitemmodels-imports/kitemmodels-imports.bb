SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. This package \
provides support to use KItemModels with the QtQuick framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kitemmodels-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "4ddc0c3210c91195ef813fd2a0fb7e278feddb1ee023d996355dfe4f4df20d564c804a31391000186c23182fadd52b5ddb3bdd1d3b9086bf597ae017fd595e31"

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
