SUMMARY = "Utility to display ditroff output"
DESCRIPTION = "xditview displays ditroff output on an X display."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xditview-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "911ba9ee45c4c233da685f32b95532f676ca1531bf38f7fa5da77124f49f464f053d3b4e99fb4132a1d40efc8bb1661a296d99f9bfcdbaeba61dc473a40f59ea"

RPROVIDES:${PN} += "xditview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
