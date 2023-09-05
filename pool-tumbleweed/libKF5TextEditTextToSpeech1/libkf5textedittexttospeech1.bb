SUMMARY = "Text to speech functionality"
DESCRIPTION = "This package provides a library for text to speech functionality."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libKF5TextEditTextToSpeech1-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "1504120a9c9a70b503514ed847efd92746b73b912e159ebe91fd5f00bf8c33408b4175c37a4552b29b0979bad8a4589417f6f1feb2f7a22ed6482726e1008827"

RPROVIDES:${PN} += "libKF5TextEditTextToSpeech.so.1 \
libKF5TextEditTextToSpeech1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
