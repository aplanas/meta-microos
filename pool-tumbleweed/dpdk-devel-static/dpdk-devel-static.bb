SUMMARY = "Data Plane Development Kit static development files"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-static-22.11.1-2.9.aarch64.rpm"
RPM_HASH = "e6904cb41df3530d1328483d0a9274af6578b235797a7116e2c262469ab82867e3d066fe6b1eeb59812dec723183aa48d60b93b228a6697689d966a3599f1879"

RPROVIDES:${PN} += "dpdk-devel-static"

RDEPENDS:${PN} += "dpdk-devel"

inherit rpm
