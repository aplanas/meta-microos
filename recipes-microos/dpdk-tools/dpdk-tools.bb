SUMMARY = "Tools for setting up Data Plane Development Kit environment"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-tools-22.11.1-2.1.aarch64.rpm"
RPM_HASH = "f7c79d606a47268b1e2b466788b1e19b2b520dccefdd30b72676725d3b518d9728955feae837e3ccc468540111ea75c969173539bf80978d04655d9f682a3159"

RPROVIDES:${PN} += "dpdk-any-tools dpdk-tools dpdk-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 dpdk findutils iproute kmod pciutils"

inherit rpm
