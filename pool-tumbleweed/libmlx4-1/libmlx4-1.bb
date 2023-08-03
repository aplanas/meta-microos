SUMMARY = "MLX4 runtime library"
DESCRIPTION = "This package contains the mlx4 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libmlx4-1-47.0-1.1.aarch64.rpm"
RPM_HASH = "b96c8a877fce9554dc1fd7b2e2965173c222d565ab6c60ea57bb63676abea759686a2072db8a69a34ce0b76ac7f5d14c6e617171fdce9993220bafdde2db59d4"

RPROVIDES:${PN} += "libmlx4-1 \
libmlx4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
