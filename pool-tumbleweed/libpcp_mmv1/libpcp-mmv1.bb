SUMMARY = "Performance Co-Pilot run-time MMV library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time Memory Mapped Values library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_mmv1-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "26f89e27b9cb7f61035d7bbeb92d466657a13b0211458617d9721eceaa7c7a9add27958cad7e2d327282c9c87210dfc15373789475bace31e67fc00ea19fcdfd"

RPROVIDES:${PN} += "libpcp_mmv.so.1()(64bit) \
libpcp_mmv.so.1(PCP_MMV_1.0)(64bit) \
libpcp_mmv.so.1(PCP_MMV_1.1)(64bit) \
libpcp_mmv.so.1(PCP_MMV_1.2)(64bit) \
libpcp_mmv1 \
libpcp_mmv1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit)"

inherit rpm
