SUMMARY = "Qt 5 Speech Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The module enables a Qt application to support accessibility features \
such as text-to-speech, which is useful for end-users who are visually \
challenged or cannot access the application for whatever reason."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde1"

RPM_NAME = "libQt5TextToSpeech5-5.15.9+kde1-1.2.aarch64.rpm"
RPM_HASH = "5a22397c7821ae27468df02f2618090f0c75ac9ce9cd5fd89f2e7d822e04ff869e44b40fd52a83220fb4edecf353266057eabee5246a2fb9a6febd885729fd50"

RPROVIDES:${PN} += "libQt5TextToSpeech.so.5()(64bit) \
libQt5TextToSpeech.so.5(Qt_5)(64bit) \
libQt5TextToSpeech5 \
libQt5TextToSpeech5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
