SUMMARY = "Data Plane Development Kit static development files (thunderx)"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-static-22.11.1-2.9.aarch64.rpm"
RPM_HASH = "c1822f6fe17a653269ad66ea97d7a68fc37e5294ae41c49186371d8a5b9ee22c075419f8199714367cff3c99442458b9514dc99070042dc481917e27b9287bad"

RPROVIDES:${PN} += "dpdk-thunderx-devel-static"

RDEPENDS:${PN} += "dpdk-thunderx-devel"

inherit rpm
