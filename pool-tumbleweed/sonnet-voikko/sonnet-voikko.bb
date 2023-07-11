SUMMARY = "KDE spell checking library: Support for Voikko"
DESCRIPTION = "Plug-in adding Voikko based spell checking for the Finnish language \
to the Sonnet spell checking framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "sonnet-voikko-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "2dc0af36f5ed79d5802e540a972a8357f3546916d9c2628bd1c7cf764c1d466241ed350c8d5755ca8896a439795b0dc4c5986aeda7b67c8097f1a363f12bedcb"

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
