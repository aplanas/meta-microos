SUMMARY = "Data Plane Development Kit API documentation"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-doc-22.11.1-2.16.noarch.rpm"
RPM_HASH = "6a0c31318fd968cd0b1d30778476957f8930b33bc0a241cd64fa6fd52dc19428f86258e5cc3d97a98d9b78862c39430e1ab325c07948ba26b00b7c16df105fed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
