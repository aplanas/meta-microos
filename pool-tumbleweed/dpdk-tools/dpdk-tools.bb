SUMMARY = "Tools for setting up Data Plane Development Kit environment"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-tools-22.11.1-2.9.aarch64.rpm"
RPM_HASH = "ac1e5a293edab316761276cf89ac8a1a92d13b8f47f911a24c4364ddc786fbddb30b54ec08a9a439bcadb901e68c4fb983b6a8f67b62a606f3ee939e67fbce7f"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
