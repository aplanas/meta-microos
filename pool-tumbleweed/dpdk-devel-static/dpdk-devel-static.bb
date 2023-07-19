SUMMARY = "Data Plane Development Kit static development files"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-static-22.11.1-2.10.aarch64.rpm"
RPM_HASH = "4996d80b6091893ebcf351e8afc6c79e7893abbe80ee99ee5cada6885bb5a78731633d77232da4bf336a17781ab6bc1ec873c912d2c6c897bda55891bc2cada8"

RPROVIDES:${PN} += "dpdk-devel-static"

RDEPENDS:${PN} += "dpdk-devel"

inherit rpm
