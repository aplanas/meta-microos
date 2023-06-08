SUMMARY = "Utilities for exFAT file system maintenance"
DESCRIPTION = "A set of utilities for creating, checking, dumping and labelling exFAT file \
system."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "exfatprogs-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "f0c90a8fde4f3c727400544b5f2f56b91ec5b1114c562697fddbf3da6502320292fc05ab274b6b144d646e2094f080ea0299c598ef6c0832b275a395dca1643b"

RPROVIDES:${PN} += "exfatprogs exfatprogs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
