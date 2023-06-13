SUMMARY = "MLX4 runtime library"
DESCRIPTION = "This package contains the mlx4 runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "45.0"

RPM_NAME = "libmlx4-1-45.0-1.1.aarch64.rpm"
RPM_HASH = "554d4d81b3aa9c41de10dc9e1d69dc4bfc45203cdf71e72c9da0fc58dffbd7d136c79ebe1a760c157a6602f9a80abbca17b2fd6de3b3621911db9685954d338e"

RPROVIDES:${PN} += "libmlx4-1 \
libmlx4-1(aarch-64) \
libmlx4.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libibverbs.so.1()(64bit) \
libibverbs.so.1(IBVERBS_PRIVATE_34)(64bit)"

inherit rpm
