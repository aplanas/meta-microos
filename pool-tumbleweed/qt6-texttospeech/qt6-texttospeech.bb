SUMMARY = "Qt 6 TextToSpeech plugin"
DESCRIPTION = "Qt 6 TextToSpeech plugin."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-texttospeech-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "54716472dde854fc86f5177860b06fc9ec0f327621461df75d32d64b2291197d8afde101d56c514506a066e2c881825a4f052aef64cfe095181f8c332165cd3a"

RPROVIDES:${PN} += "libqtexttospeech_mock.so()(64bit) \
libqtexttospeech_mock.so(Qt_6)(64bit) \
libqtexttospeech_speechd.so()(64bit) \
libqtexttospeech_speechd.so(Qt_6)(64bit) \
libtexttospeechqmlplugin.so()(64bit) \
libtexttospeechqmlplugin.so(Qt_6)(64bit) \
qt6-texttospeech \
qt6-texttospeech(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6TextToSpeech.so.6()(64bit) \
libQt6TextToSpeech.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libspeechd.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
