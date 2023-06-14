SUMMARY = "Library for graph filtering"
DESCRIPTION = "The gvpr library allows an application to perform general-purpose graph \
manipulation and filtering based on an awk-like language"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libgvpr2-2.49.3-6.3.aarch64.rpm"
RPM_HASH = "89e50dc5cc699ea711d2c2bcc1fbc8ce0f847d45130d4c6187076e6b76a086134705acc0b412a22b24d8a73fc87987adcc6614055e18b4581c72dfb7832af697"

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
