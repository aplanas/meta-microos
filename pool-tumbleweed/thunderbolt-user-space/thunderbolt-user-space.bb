SUMMARY = "Thunderbolt Device Approval support"
DESCRIPTION = "Thunderbolt is a hardware interface developed by Intel/Apple that \
allows the connection of external peripherals to a computer. \
 \
These user-space components implement device approval support: \
 \
* Interaction with the kernel module for approving connected devices. \
* ACL for auto-approving devices white-listed by the user."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "thunderbolt-user-space-0.9.3-4.18.aarch64.rpm"
RPM_HASH = "0b3a637832e14e914d9097dd135c9cf8e48b0aeb897a9976fc2ce6ab5c2311969c390aeb5d16c148d31113221a0cc6c540c69d1120db1442d0e3f303a8bed710"

RPROVIDES:${PN} += "config(thunderbolt-user-space) \
thunderbolt-user-space \
thunderbolt-user-space(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
procps"

inherit rpm
