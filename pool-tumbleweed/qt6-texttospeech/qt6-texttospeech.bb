SUMMARY = "Qt 6 TextToSpeech plugin"
DESCRIPTION = "Qt 6 TextToSpeech plugin."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-texttospeech-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "9f967336f0f90ddfbd284d3552750b8077013ed3295a873565eee2353e4074f7bb8736d9d6c31c0d74bb5f774a9ada943802a4ccfda7164af3a210832a622329"

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
