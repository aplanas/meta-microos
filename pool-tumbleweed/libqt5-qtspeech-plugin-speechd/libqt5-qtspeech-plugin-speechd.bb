SUMMARY = "Qt5 Speech Module - Speech Dispatcher support"
DESCRIPTION = "This plugin adds support for using speech-dispatcher for speech synthesis \
with the Qt5 Speech module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde1"

RPM_NAME = "libqt5-qtspeech-plugin-speechd-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "e9b74f07f9c882f1673fd634eca32c8b9834952e1a032cc8c3c018ff3f10bd291c308101183b6cec4313fa1f2aacde825b3415335a05609f02548a6bbb65b1a7"

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
