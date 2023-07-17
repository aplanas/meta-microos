SUMMARY = "Data Plane Development Kit API documentation (thunderx)"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-doc-22.11.1-2.9.noarch.rpm"
RPM_HASH = "6a79e21995ebb710c9a2db465bf7fc7855dd43122c9a8ca11bb6ded5d9f06b7c9ecb42c383c410063abee9edaa053420a4866ae45f19fc3bcdf51f883bb1305a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-thunderx-doc"

RDEPENDS:${PN} += ""

inherit rpm
