SUMMARY = "Tools for setting up Data Plane Development Kit environment"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-tools-22.11.1-2.10.aarch64.rpm"
RPM_HASH = "d3cdafcf7cfc67dcaf9ef00eaa678048d66cc583867bf71cc05d7732a8790a995d479f57ceef05e233e8179e753b9083fb3d22c0a64dc66e62fa02c9254ecd2e"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
