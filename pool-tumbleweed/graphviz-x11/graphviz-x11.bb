SUMMARY = "Graph editors based on X11"
DESCRIPTION = "The lefty/dotty/lneato X11 graph editors included with graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-x11-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "d51f3670acdd6c945e25c78bb1a50a396c918924020882d9b149886d963a896deaf18640aec192fd59eddd702ebc789e03e97f7fc9585c77f06908098a1d3a7e"

RPROVIDES:${PN} += "graphviz-x11 \
graphviz-x11(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
graphviz \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXmu.so.6()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
