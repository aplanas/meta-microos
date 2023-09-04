SUMMARY = "Tools for setting up Data Plane Development Kit environment"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-tools-22.11.1-2.15.aarch64.rpm"
RPM_HASH = "c5429e7d254362a3a9f74416902e96365b0abbc136f6bd9fc54b4be104256a6a4767deb8337b302096ba8a5258705e25e1ea9b212752c086542c91fc533adeeb"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
