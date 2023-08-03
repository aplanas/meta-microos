SUMMARY = "Qt 6 TextToSpeech library"
DESCRIPTION = "The QTextToSpeech class provides a convenient access to text-to-speech engines."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6TextToSpeech6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7bc499a1090955bf33879d0315935ba8c7125960f9ac09a4d3f68d050ba3e96982b50f115ef8ff7181208e9042f97746300a51e441c040dea0f565c17622b09d"

RPROVIDES:${PN} += "libQt6TextToSpeech.so.6 \
libQt6TextToSpeech6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-texttospeech"

inherit rpm
