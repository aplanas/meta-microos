SUMMARY = "KDE spell checking library: Support for Voikko"
DESCRIPTION = "Plug-in adding Voikko based spell checking for the Finnish language \
to the Sonnet spell checking framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "sonnet-voikko-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5d1748327c336832674b652e3033ef08b3b71fbae38ac8a6437b8469e0cd592e5209e41c9725ec78c4491802629b089d2f08244219914b1ff6ba38b122b61f5a"

RPROVIDES:${PN} += "locale-sonnet-fi \
sonnet-voikko"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6 \
libvoikko.so.1 \
sonnet"

inherit rpm
