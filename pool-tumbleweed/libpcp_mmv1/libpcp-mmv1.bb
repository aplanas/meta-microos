SUMMARY = "Performance Co-Pilot run-time MMV library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time Memory Mapped Values library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_mmv1-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "6c6157bb7ed41ac66a5540db7b2d66dacbfd844e22c9826796ab0c0ff5a0c569e33ca97c603de7f68178949d44b841ce025540aec86ea12f990021e297ffcc8b"

RPROVIDES:${PN} += "libpcp-mmv.so.1 \
libpcp-mmv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
