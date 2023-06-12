SUMMARY = "Tools for setting up Data Plane Development Kit environment (thunderx)"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-tools-22.11.1-2.4.aarch64.rpm"
RPM_HASH = "cb2b2f188051460ec8920e08e0e94fe63c04adf4a54e49e6eba998b4dec4a3a0dc52f6c002a221b34edffdc48d0c46973d431d327b1b57f80bb298e09ead33c2"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-thunderx-tools \
dpdk-thunderx-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk-thunderx \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
