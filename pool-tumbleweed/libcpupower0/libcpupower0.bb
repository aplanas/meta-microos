SUMMARY = "Processor power related C-library"
DESCRIPTION = "Contains libcpupower which offers easy functions to access \
processor frequency, processor idle, processor power hierarchy \
and other CPU power consumption related information."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "libcpupower0-6.4.6-4.19.aarch64.rpm"
RPM_HASH = "6509249e980846872236bf1c9fd529344aba1325b7451ff76338162829008218166e5c828f154719695de41c359d157d8cf51c6138fa25cfd0e34e0f5fde1e3f"

RPROVIDES:${PN} += "libcpupower.so.0 \
libcpupower0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
