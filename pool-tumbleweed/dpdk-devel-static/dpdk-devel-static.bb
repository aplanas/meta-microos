SUMMARY = "Data Plane Development Kit static development files"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-devel-static-22.11.1-2.12.aarch64.rpm"
RPM_HASH = "fdd3e629a53d44353dd4deb8585fa4adb3e3a04c4f8df7c1b4195d7a8c150e66602979a41c567559fbd5579c38274f94f457447577944ea25dcf6c8ef77e0a2b"

RPROVIDES:${PN} += "dpdk-devel-static"

RDEPENDS:${PN} += "dpdk-devel"

inherit rpm
