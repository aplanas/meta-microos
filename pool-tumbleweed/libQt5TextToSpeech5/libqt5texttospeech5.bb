SUMMARY = "Qt 5 Speech Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The module enables a Qt application to support accessibility features \
such as text-to-speech, which is useful for end-users who are visually \
challenged or cannot access the application for whatever reason."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde1"

RPM_NAME = "libQt5TextToSpeech5-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "067e257ebfd3f069ac8e7433237e38908209e09a3730126182a194b6195eaed5f2ea9c3144d30ca16e98dd08ab57fd06bfd95a70174903c6faaf1f659f650931"

RPROVIDES:${PN} += "libQt5TextToSpeech.so.5 \
libQt5TextToSpeech5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
