SUMMARY = "MLX4 runtime library"
DESCRIPTION = "This package contains the mlx4 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libmlx4-1-45.0-1.2.aarch64.rpm"
RPM_HASH = "852491167af710e6a67e8286d848b1c9ddae792e3adccbbcaac9ba4d9fbe60f2810fa5855dc5feafbb8752eb45c662f46107621489ee8f1a44c4eec900b13fc0"

RPROVIDES:${PN} += "libmlx4-1 \
libmlx4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
