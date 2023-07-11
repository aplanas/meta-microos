SUMMARY = "User interface components for kuserfeedback"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides the user interface \
components to integrate the framework in Qt applications."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libKUserFeedbackWidgets1-1.2.0-1.15.aarch64.rpm"
RPM_HASH = "30f938c5c3e1d700df3798431015a2096bf999dc8df8e6f9fa5a3354a2be9f109c725de1b2e6106eeeb5a2de3ae77143dbc846368fc3db42f91ca83b4c2f20e7"

RPROVIDES:${PN} += "libKUserFeedbackWidgets.so.1 \
libKUserFeedbackWidgets1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKUserFeedbackCore.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
