SUMMARY = "Utility to display ditroff output"
DESCRIPTION = "xditview displays ditroff output on an X display."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xditview-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "30c2553302abdc18fcb15353479eefc6dc756b553df7789578ab2ac27d2db8b0079b3b3a35fe941e35989fcd9d2c138d3d87a6e9d3106e8412b456a93d11a610"

RPROVIDES:${PN} += "xditview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
