SUMMARY = "The Firewall Knock Operator Library"
DESCRIPTION = "The Firewall Knock Operator library, libfko, provides the Single Packet \
Authorization implementation and API for the other fwknop components."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "libfko3-2.6.10-3.8.aarch64.rpm"
RPM_HASH = "80bab78ddd35703826b18eb7bbaf141b87df853d0a33721b0e3e63586cc0e9cc347b5c9c5eda55bf2a11e8922d3e365888eeb8ad19e86b54faee80ca382d8dfd"

RPROVIDES:${PN} += "libfko.so.3 \
libfko3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11"

inherit rpm
