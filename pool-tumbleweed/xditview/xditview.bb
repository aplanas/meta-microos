SUMMARY = "Utility to display ditroff output"
DESCRIPTION = "xditview displays ditroff output on an X display."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xditview-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "30c2553302abdc18fcb15353479eefc6dc756b553df7789578ab2ac27d2db8b0079b3b3a35fe941e35989fcd9d2c138d3d87a6e9d3106e8412b456a93d11a610"

RPROVIDES:${PN} += "xditview \
xditview(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
