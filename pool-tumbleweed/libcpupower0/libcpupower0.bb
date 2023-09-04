SUMMARY = "Processor power related C-library"
DESCRIPTION = "Contains libcpupower which offers easy functions to access \
processor frequency, processor idle, processor power hierarchy \
and other CPU power consumption related information."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "libcpupower0-6.4.11-4.22.aarch64.rpm"
RPM_HASH = "c8a9ceb3a9792d8e7361b93bc8632598325af6d58b4998272e00417b9034e41d161b5fc4299ff67b3b9fb9ec16d8835565c8208126067fd4644eb52e3048cdb2"

RPROVIDES:${PN} += "libcpupower.so.0 \
libcpupower0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
