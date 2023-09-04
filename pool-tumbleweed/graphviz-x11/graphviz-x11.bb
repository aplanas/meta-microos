SUMMARY = "Graph editors based on X11"
DESCRIPTION = "The lefty/dotty/lneato X11 graph editors included with graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-x11-2.49.3-6.9.aarch64.rpm"
RPM_HASH = "659ce15750415bfc3b2550493e1629cd2c615736ee94f6521bd78533eb27e8cd9d8677362b195af80016afcb97279264bbfc9fca980ae204186e228d73e37d4c"

RPROVIDES:${PN} += "graphviz-x11"

RDEPENDS:${PN} += "/usr/bin/sh \
graphviz \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
