SUMMARY = "Command line utilities for the kuserfeedback server"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides tools to connect to \
and query a local or remote KUserFeedback server."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-tools-1.2.0-1.15.aarch64.rpm"
RPM_HASH = "5652087b8a978744a48eb5bc67a7ca1c81a9dcfcecd5498069141627bdc34858151e7267a1b1e8a403d6a16ecb2dcd4bbdf5e53acd14a3d99f23cd83ebb7ac5b"

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
