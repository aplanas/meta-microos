SUMMARY = "Tools for setting up Data Plane Development Kit environment"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-tools-22.11.1-2.12.aarch64.rpm"
RPM_HASH = "4bb393e2076949b6eab7edd18b89ba71fd0c625ffd1d59dfcc1cccebafac1a975760a2388d2ba0b8ee57c9737445a572a9a51193a357c85829497fa1668adc01"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
