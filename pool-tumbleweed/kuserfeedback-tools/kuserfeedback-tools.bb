SUMMARY = "Command line utilities for the kuserfeedback server"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides tools to connect to \
and query a local or remote KUserFeedback server."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-tools-1.2.0-1.14.aarch64.rpm"
RPM_HASH = "b94d91c2318171e7349eb6d7d99006c32a836f82fe2c08ebea727fe4b448e8aa133a507cc6e0bce599aa702f01b790f28931ca85f08019c71a593753051b67f7"

RPROVIDES:${PN} += "kuserfeedback-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKUserFeedbackCore.so.1 \
libKUserFeedbackWidgets.so.1 \
libQt5Charts.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
