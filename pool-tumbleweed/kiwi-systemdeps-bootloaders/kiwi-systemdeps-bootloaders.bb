SUMMARY = "KIWI - host requirements for configuring bootloaders"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host for configuring bootloaders on images."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "kiwi-systemdeps-bootloaders-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "5ad512b2fb291783abd7c87f88051f0999d9280388c3d3ed740067ee92946816058c8d6f839b813d0a651345f839e2fe63d44aff7c345652b0c0fe7a16d4ad54"

RPROVIDES:${PN} += "kiwi-systemdeps-bootloaders"

RDEPENDS:${PN} += "grub2 \
kiwi-systemdeps-core \
u-boot-tools"

inherit rpm
