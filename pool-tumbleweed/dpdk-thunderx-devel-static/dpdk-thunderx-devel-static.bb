SUMMARY = "Data Plane Development Kit static development files (thunderx)"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-static-22.11.1-2.12.aarch64.rpm"
RPM_HASH = "87a4baa5028fc91ab0a4ed5d118da9a0922b0323556f96ad0eee18b53e0dcb7440034e2d7bb424e11a0557a794cef88cfa300ec7ceaa741feb40c4a09b00bdba"

RPROVIDES:${PN} += "dpdk-thunderx-devel-static"

RDEPENDS:${PN} += "dpdk-thunderx-devel"

inherit rpm
