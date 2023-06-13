SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libipmimonitoring library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.10"

RPM_NAME = "libipmimonitoring6-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "1e3cbf6990851ebcbe532e2bb27b44a7f02440c5a10358c07f32c2d8a0968dc374f00d8899e908e010b850adf073fbf7b2074b04ec3df5e1fdf54c7781a3e808"

RPROVIDES:${PN} += "libipmimonitoring.so.6()(64bit) \
libipmimonitoring6 \
libipmimonitoring6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libfreeipmi.so.17()(64bit)"

inherit rpm
