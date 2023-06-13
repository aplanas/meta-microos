SUMMARY = "Distributed Replicated Block Device"
DESCRIPTION = "Drbd is a distributed replicated block device. It mirrors a block \
device over the network to another machine. Think of it as networked \
raid 1. It is a building block for setting up clusters."
LICENSE = "GPL-2.0-or-later"

PV = "9.19.0"

RPM_NAME = "drbd-utils-9.19.0-11.1.aarch64.rpm"
RPM_HASH = "7457b2a1b24b3dc6f7f9096440a886cfc95e99df871bc46f0975b628e74d469300b94e6c2e736f724c1689de800a35c9f4145723beca0e62cf7eab73cf5bd79f"

RPROVIDES:${PN} += "config(drbd-utils) \
drbd-bash-completion \
drbd-control \
drbd-pacemaker \
drbd-udev \
drbd-utils \
drbd-utils(aarch-64) \
drbdsetup"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.6)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
