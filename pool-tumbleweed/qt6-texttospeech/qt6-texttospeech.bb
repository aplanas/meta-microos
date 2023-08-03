SUMMARY = "Qt 6 TextToSpeech plugin"
DESCRIPTION = "Qt 6 TextToSpeech plugin."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-texttospeech-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4fde4ba883a5f986a1e3b6051f9aff1f5c8793645a7fd233ba8603fb9d1be73df3fc6fa910e7acb9fffe47e9d58c15874409b7b4ccfb6ac659f56d208b864c00"

RPROVIDES:${PN} += "libqtexttospeech-mock.so \
libqtexttospeech-speechd.so \
libtexttospeechqmlplugin.so \
qt6-texttospeech \
qt6qmlimport-QtTextToSpeech.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6TextToSpeech.so.6 \
libc.so.6 \
libspeechd.so.2 \
libstdc++.so.6"

inherit rpm
