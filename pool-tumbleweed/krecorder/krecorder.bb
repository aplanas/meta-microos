SUMMARY = "Audio recording application"
DESCRIPTION = "Recorder is a simple, cross-platform audio recording application."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "krecorder-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "fd81e048b2a942cf2e4330ad9f94bac437834e542636b05f3b4cd4425bd3e17ce23b5f12bc2f6e935d687fadb94f5d7ca2a7ee9d95fe37f0f23669770c10522f"

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
