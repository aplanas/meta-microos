SUMMARY = "Performance Co-Pilot run-time GUI library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time graphical user interface library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_gui2-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "df3e4534b735404b7dad6486d15f7cc2316c4ca62a161f5b97c26ad2c94a8f3b147600b0845cd4c14b3c33b67f28995b6fed29970160ad663e48ac8b0e92f940"

RPROVIDES:${PN} += "libpcp-gui.so.2 \
libpcp-gui2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
