SUMMARY = "Data Plane Development Kit static development files (thunderx)"
DESCRIPTION = "This package contains the static library files needed for developing \
applications with the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-devel-static-22.11.1-2.8.aarch64.rpm"
RPM_HASH = "4fd0113fc9ec84e2c6fac6057d71763402b0a2d9de95cb699c804f94cf19aead5fd1f25e81cc61a5c514ada60efbe895f1302089794781566f0a76b82b501909"

RPROVIDES:${PN} += "dpdk-thunderx-devel-static"

RDEPENDS:${PN} += "dpdk-thunderx-devel"

inherit rpm
