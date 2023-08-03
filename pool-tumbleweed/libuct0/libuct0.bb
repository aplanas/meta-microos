SUMMARY = "Infiniband Unified Communication Transport"
DESCRIPTION = "Low-level API that expose network operations supported by underlying \
hardware."
LICENSE = "BSD-3-Clause"

PV = "1.14.1"

RPM_NAME = "libuct0-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "43228b0bb7d11f13173cf4edb33476c3107283a3cbd6dc84b5a263386d38afd24c0796fbce555d43b63e5afc4e7c97d8e6973a84beda193d26fab463351e9d6f"

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
