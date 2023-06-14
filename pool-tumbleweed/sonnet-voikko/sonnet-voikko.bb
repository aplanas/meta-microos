SUMMARY = "KDE spell checking library: Support for Voikko"
DESCRIPTION = "Plug-in adding Voikko based spell checking for the Finnish language \
to the Sonnet spell checking framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "sonnet-voikko-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "173dc571edc78aca1c03c64d427e83d71f760c3b6c2f01f4de4e616c38224fd9d9f97d4d97401034042796eb76ad81475cbba01734a51d93544e992a10e76a06"

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
