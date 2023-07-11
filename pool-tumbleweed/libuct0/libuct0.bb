SUMMARY = "Infiniband Unified Communication Transport"
DESCRIPTION = "Low-level API that expose network operations supported by underlying \
hardware."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libuct0-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "90906fdf316ca9f1ec70cdd666a61945c4b62a4f8a0b539edf68aab7ba5ccf4ac0b7076334380427313b23c2b04bf9675d47838f54c8a3fbbe3f3085fee5e480"

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
