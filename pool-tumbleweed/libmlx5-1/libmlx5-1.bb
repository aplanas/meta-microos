SUMMARY = "MLX5 runtime library"
DESCRIPTION = "This package contains the mlx5 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libmlx5-1-45.0-1.2.aarch64.rpm"
RPM_HASH = "964ca42b23c103ae9fe9352f5fb4b372c2d6b1859945f2b35a05590a820e0e3d3b59a8a7dc4bd0145d755c9625e0630d5b77e73c412b8e0f845d9558688a5136"

RPROVIDES:${PN} += "libmlx5-1 \
libmlx5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
