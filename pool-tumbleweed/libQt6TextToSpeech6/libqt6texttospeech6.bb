SUMMARY = "Qt 6 TextToSpeech library"
DESCRIPTION = "The QTextToSpeech class provides a convenient access to text-to-speech engines."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6TextToSpeech6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "77940e258084fc0211afe9e69fad3278423dbeeed6813d59905d49eef543bccfe14913ae0d4a5582bcd9e7371fd213deac9fe67b4510d04532a4a8cfc540edee"

RPROVIDES:${PN} += "libQt6TextToSpeech.so.6 \
libQt6TextToSpeech6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-texttospeech"

inherit rpm
