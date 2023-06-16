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

RPROVIDES:${PN} += "config-thunderbolt-user-space \
thunderbolt-user-space"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
procps"

inherit rpm
