SUMMARY = "Tools for setting up Data Plane Development Kit environment (thunderx)"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-tools-22.11.1-2.1.aarch64.rpm"
RPM_HASH = "5cf87203422a0f62cf1e77133d5f997c5293a5a0f685e43dfdc0cb0a70e49cafee0d918a2603950bea49e2a8c6bbf8e9912c655fc43c690c1d89f83b13cf94a9"

RPROVIDES:${PN} += "dpdk-any-tools dpdk-thunderx-tools dpdk-thunderx-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 dpdk-thunderx findutils iproute kmod pciutils"

inherit rpm
