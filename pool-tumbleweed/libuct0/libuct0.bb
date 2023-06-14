SUMMARY = "Infiniband Unified Communication Transport"
DESCRIPTION = "Low-level API that expose network operations supported by underlying \
hardware."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libuct0-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "68c5e36b46d0d43111fc3db26a4669d3ae7cf3794dc60cba1f859e9fe8bbbf5e9fbd81d18ebebe25f2322d73e4e0da274440909cf9cc360d605223cf362732da"

RPROVIDES:${PN} += "libuct-cma.so.0 \
libuct-ib.so.0 \
libuct-rdmacm.so.0 \
libuct.so.0 \
libuct0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1 \
libm.so.6 \
libmlx5.so.1 \
libnuma.so.1 \
librdmacm.so.1 \
libucs.so.0"

inherit rpm
