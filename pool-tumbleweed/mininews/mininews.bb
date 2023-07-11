SUMMARY = "Inews - Post News from an NNTP Client"
DESCRIPTION = "Rich Salz's InterNetNews news transport system."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "mininews-2.6.5-1.9.aarch64.rpm"
RPM_HASH = "36ec4ae32c6307418c3d20b1edaffe981dcecbcbe2e30bcc67f51920c7d58ad88718ea1b794333d336da8146a462c72c9785b5018614b505945e5bc19a376ae5"

RPROVIDES:${PN} += "config-mininews \
mininews \
nntp-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
group-news \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions \
user-news"

inherit rpm
