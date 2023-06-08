SUMMARY = "Data Plane Development Kit API documentation (thunderx)"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-doc-22.11.1-2.1.noarch.rpm"
RPM_HASH = "e5a121bff82ee800112fe453c9c09175f5e84c8a38358f4f9715286a19e72a18e4f209bc8d4e14f63465675e22cbf11cd38d4bba90177d4e4fe8fd309d52b97e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc dpdk-thunderx-doc"
RDEPENDS:${PN} += ""

inherit rpm
