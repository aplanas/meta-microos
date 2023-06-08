SUMMARY = "Data Plane Development Kit static development files (thunderx)"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-static-22.11.1-2.1.aarch64.rpm"
RPM_HASH = "35b9dc8bce9485e41f9bc126c13b1dd1f38423081c2b6776e135071a061feb2cf286bda280bf8edbc9022982a48ba0fc754ff0f1ec841e93685b24598ae7dd9f"

RPROVIDES:${PN} += "dpdk-thunderx-devel-static dpdk-thunderx-devel-static(aarch-64)"
RDEPENDS:${PN} += "dpdk-thunderx-devel"

inherit rpm
