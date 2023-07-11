SUMMARY = "Performance Co-Pilot run-time import library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time import library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_import1-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "d0d91a30da9e26f355dba5a0bf9146a566a6f839c6a00d81a6c43f114f373fc67a66323b64f4e6b393b2ec62824d875ee18b5366cc93e90fe3067e3d5bb5968c"

RPROVIDES:${PN} += "libpcp-import.so.1 \
libpcp-import1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
