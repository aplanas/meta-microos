SUMMARY = "Library for graph filtering"
DESCRIPTION = "The gvpr library allows an application to perform general-purpose graph \
manipulation and filtering based on an awk-like language"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libgvpr2-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "7cf633705a8300409be67699c0da85ac7821c890c1792edfd73978a124bf5ff0691f262ae3c12e656a49f06aecb840461eb59e64a194e1c63a3fa4e3d0313d25"

RPROVIDES:${PN} += "libgraphviz6-/usr/lib64/libgvpr.so.2 \
libgvpr.so.2 \
libgvpr2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdt.so.5 \
libcgraph.so.6 \
libm.so.6"

inherit rpm
