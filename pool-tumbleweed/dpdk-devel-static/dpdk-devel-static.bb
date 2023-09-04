SUMMARY = "Data Plane Development Kit static development files"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-static-22.11.1-2.15.aarch64.rpm"
RPM_HASH = "b1d387a493f87ade093344a3aa7d29f1be414478c339df9c0183d030c30f1f7f631c8fd864fa5c4aed0e94ed4243e39d331237d5852ecbfb01c5d04906e9e64a"

RPROVIDES:${PN} += "dpdk-devel-static"

RDEPENDS:${PN} += "dpdk-devel"

inherit rpm
