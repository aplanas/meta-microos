SUMMARY = "Processor power related C-library"
DESCRIPTION = "Contains libcpupower which offers easy functions to access \
processor frequency, processor idle, processor power hierarchy \
and other CPU power consumption related information."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "libcpupower0-6.4.12-4.23.aarch64.rpm"
RPM_HASH = "d5aa3e07e6d035aca1d5a7a88cafa04cc59e1eaab0da01711cf9896cc58557b088f842d84f5beec462fc86b69dd4acc1e8ab8678b69a90eec71dc6f2c76f639f"

RPROVIDES:${PN} += "libcpupower.so.0 \
libcpupower0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
