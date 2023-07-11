SUMMARY = "Shared library of FreeRADIUS Client"
DESCRIPTION = "The package contains the shared library of FreeRADIUS Client"
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "freeradius-client-libs-1.1.7-1.31.aarch64.rpm"
RPM_HASH = "c6b5fbd038e79b32c4c20251fabce5cf07e9e6ad1ceb9d29ebb8954cf87594d0ed1a435425ead31257b0761b1bbe9428e04349229af90775cc25ca149b4493bd"

RPROVIDES:${PN} += "freeradius-client-libs \
libfreeradius-client.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnettle.so.8"

inherit rpm
