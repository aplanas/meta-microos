SUMMARY = "Performance Co-Pilot run-time GUI library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time graphical user interface library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_gui2-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "0f513d5b4a2f4b24d1983f25721e67e4ac3e7cf21cba8149e6c6f04e88108d26caf433accc6ebaa4acf88a098d9c6207f42a9ffaee18baa2e517f75f74dc33e0"

RPROVIDES:${PN} += "libpcp-gui.so.2 \
libpcp-gui2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
