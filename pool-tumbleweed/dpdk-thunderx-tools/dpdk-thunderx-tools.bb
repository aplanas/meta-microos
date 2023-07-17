SUMMARY = "Tools for setting up Data Plane Development Kit environment (thunderx)"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-tools-22.11.1-2.9.aarch64.rpm"
RPM_HASH = "e72e7a5dfbf58b95e657281ee6cc909c06fe7caac371983015d7429d80f242c54854e63ba4b81dee3c92b3884de699033b20423b80de9d4079a235db325f056a"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-thunderx-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk-thunderx \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
