SUMMARY = "Ibverbs runtime library"
DESCRIPTION = "This package contains the ibverbs runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libibverbs1-45.0-1.1.aarch64.rpm"
RPM_HASH = "414aede823da20243dc98d3cb56355002b425f28c8db0f8564ca03d5b456398907f1d8c20a217e3f650d1bc95f98fa24f2707150545eefcae3c9bda3e3e998b8"

RPROVIDES:${PN} += "libibverbs.so.1 \
libibverbs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libnl-3.so.200 \
libnl-route-3.so.200"

inherit rpm
