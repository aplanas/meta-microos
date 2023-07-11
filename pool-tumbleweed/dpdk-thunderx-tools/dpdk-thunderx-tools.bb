SUMMARY = "Tools for setting up Data Plane Development Kit environment (thunderx)"
DESCRIPTION = "This package contains tools for setting up Data Plane Development Kit environment"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-tools-22.11.1-2.8.aarch64.rpm"
RPM_HASH = "f262e7666d554e93e93ddcb142acaa017e1951e61cf706b9f43252642e36af89bf85f0ae9b50748f2b163efc7ea3552e04592776dd1b4d42249939895c9f3def"

RPROVIDES:${PN} += "dpdk-any-tools \
dpdk-thunderx-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
dpdk-thunderx \
findutils \
iproute \
kmod \
pciutils"

inherit rpm
