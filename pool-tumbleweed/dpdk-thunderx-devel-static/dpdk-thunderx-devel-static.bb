SUMMARY = "Data Plane Development Kit static development files (thunderx)"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-static-22.11.1-2.10.aarch64.rpm"
RPM_HASH = "ed2a2aa91a815c25e45fdf943388ff8edf07b0de9047346889f44ac01ba8dd92841b57dbb4e7d60f5e650f1c60299d1bb365abbcfa313928c2d40679c121c7e4"

RPROVIDES:${PN} += "dpdk-thunderx-devel-static"

RDEPENDS:${PN} += "dpdk-thunderx-devel"

inherit rpm
