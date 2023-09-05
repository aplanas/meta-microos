SUMMARY = "Data Plane Development Kit static development files (thunderx)"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-static-22.11.1-2.16.aarch64.rpm"
RPM_HASH = "d0f0a93e688ac3525e58894f06470a14e42b333d8ee038ce5434f2d764909dd081484f309c4a150f2d433d7b1aa003d5b9c3f801d4b85e725503b77699c77eca"

RPROVIDES:${PN} += "dpdk-thunderx-devel-static"

RDEPENDS:${PN} += "dpdk-thunderx-devel"

inherit rpm
