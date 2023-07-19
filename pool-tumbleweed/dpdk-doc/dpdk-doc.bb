SUMMARY = "Data Plane Development Kit API documentation"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-doc-22.11.1-2.10.noarch.rpm"
RPM_HASH = "8887ac01b816726f8a98db730ecf0e3d033b5cc5e29237ca51e5fa40256c91123da12b6227ddbbef90d3f1c175c9a22050a95a2359fba76cc3f2716a2943f37b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
