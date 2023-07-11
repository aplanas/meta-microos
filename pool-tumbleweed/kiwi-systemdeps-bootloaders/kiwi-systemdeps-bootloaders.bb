SUMMARY = "KIWI - host requirements for configuring bootloaders"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host for configuring bootloaders on images."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-bootloaders-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "7044ee6387bbb8cfaca7d13e1f67ece372d3175d1d97accc62d84755e1b805830d0ad0cf0345664deed9fda5ba181e05c4c5e20cdacdf4681db200ade8f324f6"

RPROVIDES:${PN} += "kiwi-systemdeps-bootloaders"

RDEPENDS:${PN} += "grub2 \
kiwi-systemdeps-core \
u-boot-tools"

inherit rpm
