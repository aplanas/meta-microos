SUMMARY = "QML interface components for kuserfeedback"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides the QtQuick components \
needed to build QML interfaces leveraging the library."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-imports-1.2.0-1.15.aarch64.rpm"
RPM_HASH = "639419020a00f02a981e38a431cd9814737c62df22a9fa98e5ea193171e026ace968afda6a6b94d88f282654b4bd4f25acfe4c0fe31320acdef5a1b2df8f0b35"

RPROVIDES:${PN} += "kuserfeedback-imports \
libKUserFeedbackQml.so \
qt5qmlimport-org.kde.userfeedback.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKUserFeedbackCore.so.1 \
libKUserFeedbackCore1 \
libKUserFeedbackWidgets1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
