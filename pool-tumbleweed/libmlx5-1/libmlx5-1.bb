SUMMARY = "MLX5 runtime library"
DESCRIPTION = "This package contains the mlx5 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libmlx5-1-47.0-2.2.aarch64.rpm"
RPM_HASH = "8019453992c0270ca8214a9610d34e58d973d05cb729bd0c66c66cfc6aa1df554005929069117e61e460ce8e9d5664d67ec76c57fc16b6e280a408c19dfb27fd"

RPROVIDES:${PN} += "libmlx5-1 \
libmlx5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
