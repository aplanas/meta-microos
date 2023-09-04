SUMMARY = "Programs for making SPF queries using libspf2"
DESCRIPTION = "Programs for making SPF queries and checking their results using libspf2."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-tools-1.2.11-6.14.aarch64.rpm"
RPM_HASH = "e597a9f7740423d8d6962302a4a7f18962443745e537cc41f859529219bdf58a7788b594d8d3c4e249f7235f1e4921655d38206d46ca283ddb648939ec39e2e1"

RPROVIDES:${PN} += "libspf2-tools \
spf2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspf2.so.2"

inherit rpm
