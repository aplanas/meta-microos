SUMMARY = "Tools for setting up Data Plane Development Kit environment"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-tools-22.11.1-2.4.aarch64.rpm"
RPM_HASH = "174a429cc7e8864386828706de494c531101c7daa3111b22a611f885b5f35dbac97027dab586db3e7f12a3601ea743302cb916a3fc867d5b7436188d6e36e183"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-tools \
dpdk-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
