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

RPM_NAME = "thunderbolt-user-space-0.9.3-4.19.aarch64.rpm"
RPM_HASH = "2577613396849d061972e364ff3ed56c892ba50bf852efaa834df88c9d5148fe1c2c5f2fb57cd3ec96006e2221281b06e633f7680501f48f404a9c1cc2b73a85"

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
