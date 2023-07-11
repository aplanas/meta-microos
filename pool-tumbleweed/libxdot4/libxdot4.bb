SUMMARY = "Library for parsing and deparsing of xdot operations"
DESCRIPTION = "The libxdot library provides support for parsing and deparsing graphical \
operations specified by the xdot language."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libxdot4-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "a54a94d0a9d2ddb07503274cb2da05e86b812f363dad086bf31601743c50ae99fde055b4904526725d9911dac15b16c923e62e62ef772903cce69c313fa07f31"

RPROVIDES:${PN} += "libgraphviz6-/usr/lib64/libxdot.so.4 \
libxdot.so.4 \
libxdot4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
