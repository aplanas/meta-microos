SUMMARY = "MLX4 runtime library"
DESCRIPTION = "This package contains the mlx4 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libmlx4-1-47.0-3.1.aarch64.rpm"
RPM_HASH = "b1ebbd508f8fb8d0e20d923f763784157db91d26d4ce8524287648acecc947f27638fef852ed083ef878625455e7a353c941515b9eeaba42037cf98b0ea6a21f"

RPROVIDES:${PN} += "libmlx4-1 \
libmlx4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
