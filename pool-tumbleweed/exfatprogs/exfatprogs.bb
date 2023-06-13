SUMMARY = "Utilities for exFAT file system maintenance"
DESCRIPTION = "A set of utilities for creating, checking, dumping and labelling exFAT file \
system."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "exfatprogs-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "110c31d47e082351a2f8e98be0b12f7be167423f0025fa887485f0405d88742885bbf78f569be33e8f28cb6e14393d4a40e511c63db9ef764a68133ecf996391"

RPROVIDES:${PN} += "exfatprogs \
exfatprogs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
