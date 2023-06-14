SUMMARY = "Audio recording application"
DESCRIPTION = "Recorder is a simple, cross-platform audio recording application."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "krecorder-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b4fea5532dd17bf3437ce4bd6af74b60de486e0f492b1b977290bedec9d02f3eca55ff0177f35b868ef361365c2734c96e3b8fc5666bce1df5fba5d826897160"

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
