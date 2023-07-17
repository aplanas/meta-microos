SUMMARY = "Kernel Documentation"
DESCRIPTION = "A few basic documents from the current kernel sources. \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-docs-6.4.2-1.1.noarch.rpm"
RPM_HASH = "946945d68ac9ca8c849e6105026c7012d18a47a4b73c3437b338e66a87ffd85b8176799e47f30976058b73d7901f5f04c5943ae8400d21ff762d5d3c03c51dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kernel-docs \
kernel-docs-srchash-b97b89494481f3409297e494e466bdd42b1311ab"

RDEPENDS:${PN} += ""

inherit rpm
