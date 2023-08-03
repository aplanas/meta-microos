SUMMARY = "Data Plane Development Kit API documentation (thunderx)"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-doc-22.11.1-2.12.noarch.rpm"
RPM_HASH = "7ddd891b89bd279804a1b1a70b373a20dea03b52458cbf277890e2c23e010b26ece7b5c4301cbb7d0d7bef0590b19f2b704d99d7b9c577e60b7459eaa70b8a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-thunderx-doc"

RDEPENDS:${PN} += ""

inherit rpm
