SUMMARY = "Tools for setting up Data Plane Development Kit environment (thunderx)"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-tools-22.11.1-2.15.aarch64.rpm"
RPM_HASH = "f1a545d3cb12a96c54dac00ee5bafe606e514366134fbbf51c4e997c53e11a56f408ffa353be95e5a6ce9035a6cca97249dbb3e1cf6aea56f636e068613dea81"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-thunderx-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk-thunderx \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
