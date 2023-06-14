SUMMARY = "Qt 6 TextToSpeech library"
DESCRIPTION = "The QTextToSpeech class provides a convenient access to text-to-speech engines."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6TextToSpeech6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "482ac3f25f1bfbc89bd6e36e7e0969c4becd692c57c2e5b9f63aab454e972e42709d7ea9e858ca5701e903af49f5a681f1f9c4b3d8366375fa24c2d6a410e5d0"

RPROVIDES:${PN} += "libQt6TextToSpeech.so.6 \
libQt6TextToSpeech6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-texttospeech"

inherit rpm
