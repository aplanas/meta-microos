SUMMARY = "Performance Co-Pilot run-time import library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time import library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_import1-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "961493733dfe1744a7f13fb7ff85574c0c81de5b7aaab441b2a4f57110902772910a0ceedf691648dfd48aecc6905fbfb1850bc3bd2257b21afa543f2b017b9d"

RPROVIDES:${PN} += "libpcp_import.so.1()(64bit) \
libpcp_import.so.1(PCP_IMPORT_1.0)(64bit) \
libpcp_import.so.1(PCP_IMPORT_1.1)(64bit) \
libpcp_import.so.1(PCP_IMPORT_1.2)(64bit) \
libpcp_import1 \
libpcp_import1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.20)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp.so.3(PCP_3.26)(64bit) \
libpcp.so.3(PCP_3.4)(64bit)"

inherit rpm
