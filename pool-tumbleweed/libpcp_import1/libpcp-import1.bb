SUMMARY = "Performance Co-Pilot run-time import library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time import library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_import1-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "bbbaaea4f4e54ce96f75a47a47859c0f537b457e519317c2f8e70abd1cdbb9ebd8ddcc3161e8f4033a9b9f81aa614e2cad8f2bf10da49db0376bf291ca111762"

RPROVIDES:${PN} += "libpcp-import.so.1 \
libpcp-import1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
