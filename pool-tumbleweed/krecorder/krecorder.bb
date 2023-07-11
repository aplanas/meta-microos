SUMMARY = "Audio recording application"
DESCRIPTION = "Recorder is a simple, cross-platform audio recording application."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "krecorder-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1aa32307f164268d277441099cb3de192cc4aecc2510e610eb824aa2a9567221cae5f63fd47248ba175372260683294315702850180b1e82a36b15f9db052297"

RPROVIDES:${PN} += "krecorder"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
