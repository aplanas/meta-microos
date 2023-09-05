SUMMARY = "Data Plane Development Kit static development files"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-static-22.11.1-2.16.aarch64.rpm"
RPM_HASH = "eae0120c9eb331c34ea2f037bf813543e980614cf084c444f7a26c018b7fbb7182dc3d0ba0a9c42846c9e2053dacd635bcb35516393d6ea17fe63ebae8ab02de"

RPROVIDES:${PN} += "dpdk-devel-static"

RDEPENDS:${PN} += "dpdk-devel"

inherit rpm
