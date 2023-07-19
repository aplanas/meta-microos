SUMMARY = "Processor power related C-library"
DESCRIPTION = "Contains libcpupower which offers easy functions to access \
processor frequency, processor idle, processor power hierarchy \
and other CPU power consumption related information."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "libcpupower0-6.4.3-4.17.aarch64.rpm"
RPM_HASH = "e0a470c7befe7f2669d42634576f97f82f6bc15af79e105909961dff8651c32e4f77992b546915286ca5f4f1742c7583b7b28ec4bab97ac193c34effd5e4417f"

RPROVIDES:${PN} += "libcpupower.so.0 \
libcpupower0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
