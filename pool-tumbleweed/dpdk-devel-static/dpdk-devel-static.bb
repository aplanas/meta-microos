SUMMARY = "Data Plane Development Kit static development files"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-static-22.11.1-2.4.aarch64.rpm"
RPM_HASH = "53cb8a7b8630bb5b5100c8308a9bb99d0855b6cc58bbc60a45902a82a6f106ab3df9af4bd95a8438e98e166ecd2cda71a6491b68fca418f18e6066f00e926518"

RPROVIDES:${PN} += "dpdk-devel-static"

RDEPENDS:${PN} += "dpdk-devel"

inherit rpm
