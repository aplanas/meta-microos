SUMMARY = "MLX4 runtime library"
DESCRIPTION = "This package contains the mlx4 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libmlx4-1-47.0-2.2.aarch64.rpm"
RPM_HASH = "42ec7980dc6e9a08679ea3450c3954b7fa9fe787aa44c47047e91a31786e576910488c801b14842b69ce979587b39c9579e56a54e12c86d2b34c8a9d2b9e4ecc"

RPROVIDES:${PN} += "libmlx4-1 \
libmlx4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
