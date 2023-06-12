SUMMARY = "Data Plane Development Kit static development files (thunderx)"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-static-22.11.1-2.4.aarch64.rpm"
RPM_HASH = "22da84d52c08e98cb728c7ba652e909d0f62a495b205af0b5845b1e7b223aeda7136582ce8570a6f9a9bdaf4f0525153ad7a004ffdf48f40218e626a848dc64e"

RPROVIDES:${PN} += "dpdk-thunderx-devel-static dpdk-thunderx-devel-static(aarch-64)"
RDEPENDS:${PN} += "dpdk-thunderx-devel"

inherit rpm
