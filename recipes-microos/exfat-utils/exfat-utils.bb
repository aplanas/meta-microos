SUMMARY = "Utilities for exFAT file system"
DESCRIPTION = "A set of utilities for creating, checking, dumping and labelling exFAT file \
system."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "exfat-utils-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "733bedbe7e455ad8a5018b4e14bdc0918cc85c535113fa187ce867db09b431884dc9c3a999b6c310b5b3cbcc82a343eef82215ecf9e87204739c8127252e5df7"

RPROVIDES:${PN} += "exfat-utils exfat-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
