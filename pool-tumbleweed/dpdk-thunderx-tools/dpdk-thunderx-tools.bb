SUMMARY = "Tools for setting up Data Plane Development Kit environment (thunderx)"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-tools-22.11.1-2.12.aarch64.rpm"
RPM_HASH = "16a31a50490efd38742555d66cc4a457f80e837ea50cceba4a2355134cd1f5db963cf7a18227eb5ad214c11bd45d3b6092480469084ce535bf88e316f8e5fa8a"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-thunderx-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk-thunderx \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
