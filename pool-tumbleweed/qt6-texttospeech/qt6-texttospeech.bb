SUMMARY = "Qt 6 TextToSpeech plugin"
DESCRIPTION = "Qt 6 TextToSpeech plugin."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-texttospeech-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "54716472dde854fc86f5177860b06fc9ec0f327621461df75d32d64b2291197d8afde101d56c514506a066e2c881825a4f052aef64cfe095181f8c332165cd3a"

RPROVIDES:${PN} += "libqtexttospeech-mock.so \
libqtexttospeech-speechd.so \
libtexttospeechqmlplugin.so \
qt6-texttospeech"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6TextToSpeech.so.6 \
libc.so.6 \
libspeechd.so.2 \
libstdc++.so.6"

inherit rpm
