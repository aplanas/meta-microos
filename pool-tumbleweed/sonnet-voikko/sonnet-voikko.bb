SUMMARY = "KDE spell checking library: Support for Voikko"
DESCRIPTION = "Plug-in adding Voikko based spell checking for the Finnish language \
to the Sonnet spell checking framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "sonnet-voikko-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "8fa3600b27acca236dc51f4f8a376c2a0aac6ef054371ea94962947891854ee2708063e111294ae7903f4ebfdafdccd1affe45000bbfa954efcf8d0999d63246"

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
