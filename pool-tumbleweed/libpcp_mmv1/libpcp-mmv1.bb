SUMMARY = "Performance Co-Pilot run-time MMV library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time Memory Mapped Values library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_mmv1-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "26f89e27b9cb7f61035d7bbeb92d466657a13b0211458617d9721eceaa7c7a9add27958cad7e2d327282c9c87210dfc15373789475bace31e67fc00ea19fcdfd"

RPROVIDES:${PN} += "libpcp-mmv.so.1 \
libpcp-mmv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
