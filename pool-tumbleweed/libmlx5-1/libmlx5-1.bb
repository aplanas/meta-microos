SUMMARY = "MLX5 runtime library"
DESCRIPTION = "This package contains the mlx5 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libmlx5-1-47.0-1.1.aarch64.rpm"
RPM_HASH = "5e1669f58a8a5c2e35675259ac52408ba682a8fc6e8c3f298ff0564834fcbab070ae7e2480cfd851fb50c1461e019e712e00f485fcccf96b43a0291c19871c0b"

RPROVIDES:${PN} += "libmlx5-1 \
libmlx5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
