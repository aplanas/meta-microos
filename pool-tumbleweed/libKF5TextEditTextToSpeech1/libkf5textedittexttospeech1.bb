SUMMARY = "Text to speech functionality"
DESCRIPTION = "This package provides a library for text to speech functionality."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "libKF5TextEditTextToSpeech1-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "07a09fe67eafb79585c9d780bde81793e5aac0f98e76fba3b90284ae2d07444e3313e2fd0028ffaa2baef3e4139477db0e774b3bce3bbf8710e22ddff05b144f"

RPROVIDES:${PN} += "libKF5TextEditTextToSpeech.so.1()(64bit) \
libKF5TextEditTextToSpeech1 \
libKF5TextEditTextToSpeech1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5TextToSpeech.so.5()(64bit) \
libQt5TextToSpeech.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
