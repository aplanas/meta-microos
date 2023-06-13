SUMMARY = "QML interface components for kuserfeedback"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides the QtQuick components \
needed to build QML interfaces leveraging the library."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-imports-1.2.0-1.14.aarch64.rpm"
RPM_HASH = "6621426d16108c88bdead673f25f78a920240ccc2ae615664a5f64aad3ab0eac629bd284af460b93b60f44fad4c5eb6355c85cf48710ead2f694595aa1a264bf"

RPROVIDES:${PN} += "kuserfeedback-imports \
kuserfeedback-imports(aarch-64) \
libKUserFeedbackQml.so()(64bit) \
qt5qmlimport(org.kde.userfeedback.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKUserFeedbackCore.so.1()(64bit) \
libKUserFeedbackCore1 \
libKUserFeedbackWidgets1 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
