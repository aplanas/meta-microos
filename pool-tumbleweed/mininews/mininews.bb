SUMMARY = "Inews - Post News from an NNTP Client"
DESCRIPTION = "Rich Salz's InterNetNews news transport system."
LICENSE = "BSD-4-Clause & GPL-2.0-or-later"

PV = "2.6.5"

RPM_NAME = "mininews-2.6.5-1.10.aarch64.rpm"
RPM_HASH = "5452c4564529a4660c0838e35712f8ef8b4859346cac09daca203ddfe3c6e3b95286eb89e80419abbed005c2a69ffd2f0310fdb4ad74dbd2887e0e4c651920a8"

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
