SUMMARY = "Qt5 Speech Module - Speech Dispatcher support"
DESCRIPTION = "This plugin adds support for using speech-dispatcher for speech synthesis \
with the Qt5 Speech module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtspeech-plugin-speechd-5.15.9+kde1-1.2.aarch64.rpm"
RPM_HASH = "993a4e94488d7a1e99379b7e0b118e65d5fc9365ef65700e22ae1aa1602489bdcf3cc975af7aa4eb344d8f91b723bd6a631c81d5f98e0c45233da9dd011bbd17"

RPROVIDES:${PN} += "libqt5-qtspeech-plugin-speechd \
libqtexttospeech-speechd.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5TextToSpeech.so.5 \
libQt5TextToSpeech5 \
libc.so.6 \
libspeechd.so.2 \
libstdc++.so.6"

inherit rpm
