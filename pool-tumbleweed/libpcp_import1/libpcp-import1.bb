SUMMARY = "Performance Co-Pilot run-time import library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time import library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_import1-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "961493733dfe1744a7f13fb7ff85574c0c81de5b7aaab441b2a4f57110902772910a0ceedf691648dfd48aecc6905fbfb1850bc3bd2257b21afa543f2b017b9d"

RPROVIDES:${PN} += "libpcp-import.so.1 \
libpcp-import1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
