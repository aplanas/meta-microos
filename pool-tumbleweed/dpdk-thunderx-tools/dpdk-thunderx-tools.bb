SUMMARY = "Tools for setting up Data Plane Development Kit environment (thunderx)"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-tools-22.11.1-2.10.aarch64.rpm"
RPM_HASH = "d64bbb63599c4606aedee39b548f82158baef077e7c0baa66808b8409bff374debaed01789f2d4d087e33c3b0fe828a233c8ed00e09f526b212444b90afe617e"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-thunderx-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk-thunderx \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
