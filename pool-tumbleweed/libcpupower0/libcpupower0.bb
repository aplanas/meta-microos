SUMMARY = "Processor power related C-library"
DESCRIPTION = "Contains libcpupower which offers easy functions to access \
processor frequency, processor idle, processor power hierarchy \
and other CPU power consumption related information."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "libcpupower0-6.4.2-4.16.aarch64.rpm"
RPM_HASH = "673b6fbbaa12873d2cb2c5266357afd1f790d809c48963e433317eb987dc39f21c5c8d22bba677b314fb60d6e3d76dd4b6abc26cf2922dedceca8636f8a56f0f"

RPROVIDES:${PN} += "libcpupower.so.0 \
libcpupower0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
