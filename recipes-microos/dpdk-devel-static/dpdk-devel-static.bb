SUMMARY = "Data Plane Development Kit static development files"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-static-22.11.1-2.1.aarch64.rpm"
RPM_HASH = "b152ad5dfb5b7bbb4c56fd81088f18b963cb6c75dfda547525e804e65136dc50d45673c78c47d5e8d43a7b4ad5cf6f59c829822a71141ce3a161c8e4bc05c095"

RPROVIDES:${PN} += "dpdk-devel-static dpdk-devel-static(aarch-64)"
RDEPENDS:${PN} += "dpdk-devel"

inherit rpm
