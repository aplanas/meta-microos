SUMMARY = "Data Plane Development Kit API documentation (thunderx)"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-doc-22.11.1-2.15.noarch.rpm"
RPM_HASH = "24248446275530ec19d90c80877e2c9beeb8a26b2007020cc89443130444717351d66d572c692829a7942132f9759b31a1cd50eff0176602974906d46f5df1ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-thunderx-doc"

RDEPENDS:${PN} += ""

inherit rpm
