SUMMARY = "Graph editors based on X11"
DESCRIPTION = "The lefty/dotty/lneato X11 graph editors included with graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-x11-2.49.3-6.8.aarch64.rpm"
RPM_HASH = "c6adb07cb81ec01c2a4489a536c85a5254f8547403921c16d5387ed015a2a005b98cca376df041947d7ca0f00088ad8473e8cbb6de4fc27aa624c55f58492200"

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
