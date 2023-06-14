SUMMARY = "Shared library of FreeRADIUS Client"
DESCRIPTION = "The package contains the shared library of FreeRADIUS Client"
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "freeradius-client-libs-1.1.7-1.30.aarch64.rpm"
RPM_HASH = "30e6b69e8094c6c910654e14dac09e660eb23d4d149b02f0fd9899d875ba2f1b76c6816076a6dcaf4a23aa889ae8d456cc710db55f1c9851b3f0d4a3621a7aaa"

RPROVIDES:${PN} += "freeradius-client-libs \
libfreeradius-client.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnettle.so.8"

inherit rpm
