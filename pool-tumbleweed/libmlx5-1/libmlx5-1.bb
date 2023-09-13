SUMMARY = "MLX5 runtime library"
DESCRIPTION = "This package contains the mlx5 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libmlx5-1-47.0-3.1.aarch64.rpm"
RPM_HASH = "700f4b3a46abace7276a4264583a753c66eabde7100022535aca7641b555f72f7b1589247a4f86efdd9f32177df8b7f47308f5f0b310209f53824ec405641b3c"

RPROVIDES:${PN} += "libmlx5-1 \
libmlx5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
