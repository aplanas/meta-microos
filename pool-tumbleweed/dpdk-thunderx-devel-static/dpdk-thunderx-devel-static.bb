SUMMARY = "Data Plane Development Kit static development files (thunderx)"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-static-22.11.1-2.15.aarch64.rpm"
RPM_HASH = "7b4e360b1cac2925206f1a711154e388a718208e06ee13add288cd594cd0f1c52b106db2e8aba46eef16cf9060570acb4967d8ec1a36566d1e31a6f709c948e4"

RPROVIDES:${PN} += "dpdk-thunderx-devel-static"

RDEPENDS:${PN} += "dpdk-thunderx-devel"

inherit rpm
