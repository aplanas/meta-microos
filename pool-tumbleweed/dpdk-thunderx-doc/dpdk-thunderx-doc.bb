SUMMARY = "Data Plane Development Kit API documentation (thunderx)"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-doc-22.11.1-2.16.noarch.rpm"
RPM_HASH = "cb14b49fe4556363431372d3b898a6ae7c2d9e05182a47f4aaa190fb1fc3698f9e4c67293774f59eb06262f542e7c63b066d09742394e12d80b49d4d8c900b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-thunderx-doc"

RDEPENDS:${PN} += ""

inherit rpm
