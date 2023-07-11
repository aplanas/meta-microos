SUMMARY = "Data Plane Development Kit static development files"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-static-22.11.1-2.8.aarch64.rpm"
RPM_HASH = "b545a2740541ee18f2c1de974ed4ffc86f17f536b4e71862b6ee1dee7a33fd576c55bc65aef510e8e1f4e5d9195a9ccdb46757a5a5e18192dfe894e8611c8329"

RPROVIDES:${PN} += "dpdk-devel-static"

RDEPENDS:${PN} += "dpdk-devel"

inherit rpm
