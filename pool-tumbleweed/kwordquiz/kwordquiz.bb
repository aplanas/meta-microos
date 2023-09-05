SUMMARY = "Vocabulary Trainer"
DESCRIPTION = "A flashcard and vocabulary learning program."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kwordquiz-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d28534dcbe0749f3130e8c98cf1abc35691353b0726494526a57e210c58678ea3592a94ea19c1273b691e2c38ab0fb0d98a2bbeb4ca5f0eb2b012ea15babe8e6"

RPROVIDES:${PN} += "kwordquiz \
kwordquiz5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKEduVocDocument.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5NewStuffCore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
