SUMMARY = "The Firewall Knock Operator Library"
DESCRIPTION = "The Firewall Knock Operator library, libfko, provides the Single Packet \
Authorization implementation and API for the other fwknop components."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "libfko3-2.6.10-3.9.aarch64.rpm"
RPM_HASH = "9a0db6c9d937eac9e911c37cd4474cc35caa84f6683289d2787c3c1b351e02174d1786918635f662f3daaaa175764e08ecb91f0fe29b967b1b43114982e51de6"

RPROVIDES:${PN} += "libfko.so.3 \
libfko3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.11"

inherit rpm
