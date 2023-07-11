SUMMARY = "Processor power related C-library"
DESCRIPTION = "Contains libcpupower which offers easy functions to access \
processor frequency, processor idle, processor power hierarchy \
and other CPU power consumption related information."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "libcpupower0-6.3.9-4.15.aarch64.rpm"
RPM_HASH = "24b1e201ca73502c3ad9580f21c2186efb2e025488d01152e95c2884000201e3cd57e761b2f0c9b63f1331d88a4f6aa8b217081f6d90de7cab34cf3ab17004b6"

RPROVIDES:${PN} += "libcpupower.so.0 \
libcpupower0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
