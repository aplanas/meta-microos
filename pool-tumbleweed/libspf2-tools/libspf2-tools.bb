SUMMARY = "Programs for making SPF queries using libspf2"
DESCRIPTION = "Programs for making SPF queries and checking their results using libspf2."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-tools-1.2.11-6.13.aarch64.rpm"
RPM_HASH = "9214ff5a441ac6e521bdafac171b40f3c16d31f5120ebd98d796a20a7425098dc7b814a6fd12f05658e619c2d81c7c29b07b8d36082628a61f3f07aad6a8b105"

RPROVIDES:${PN} += "libspf2-tools \
spf2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspf2.so.2"

inherit rpm
