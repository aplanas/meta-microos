SUMMARY = "Distributed Replicated Block Device"
DESCRIPTION = "Drbd is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.19.0"

RPM_NAME = "drbd-utils-9.19.0-10.1.aarch64.rpm"
RPM_HASH = "271374e4c8d8e44c35545d3770089007b3bb224a1177c62d2ab0d26c43d71e49ea3a9487c1fc165df1528929c818d8336d10f172a32d1e78a41e85113969dc77"

RPROVIDES:${PN} += "config(drbd-utils) drbd-bash-completion drbd-control drbd-pacemaker drbd-udev drbd-utils drbd-utils(aarch-64) drbdsetup"
RDEPENDS:${PN} += "/bin/bash /bin/sh libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.6)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
