SUMMARY = "Utility to list fonts available from an X server"
DESCRIPTION = "xlsfonts lists fonts available from an X server via the X11 core \
protocol."
LICENSE = "X11"

PV = "1.0.7"

RPM_NAME = "xlsfonts-1.0.7-1.7.aarch64.rpm"
RPM_HASH = "179f2e745981b0b00ccb5b4b2a8465ea069c71cb7c1557ee1bb2b28f6fecadff8b02ceec5fd91821c10162ae2a26ae270bcab274c7a8b599ca234535112d69b1"

RPROVIDES:${PN} += "xlsfonts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
