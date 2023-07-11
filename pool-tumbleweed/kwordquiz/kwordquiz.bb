SUMMARY = "Vocabulary Trainer"
DESCRIPTION = "A flashcard and vocabulary learning program."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kwordquiz-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1215ce2488ce307482c80b788507a3fe371dbae5947696c93b76e627093a09e64f7c622b21e78513a29f1ef48c5b468fcc80436b09f547f6b0917e3707aef5a0"

RPROVIDES:${PN} += "kwordquiz \
kwordquiz5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKEduVocDocument.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
