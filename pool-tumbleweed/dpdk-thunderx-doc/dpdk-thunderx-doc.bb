SUMMARY = "Data Plane Development Kit API documentation (thunderx)"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-thunderx-doc-22.11.1-2.10.noarch.rpm"
RPM_HASH = "8e9bea0bf5449420f981999de210a745b3ee92948bdcd4c2d07283ca50f825b46a4abed91136deb80b3b5316e402bd8ec36af345a5ee33747cdf48993bbdc252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-thunderx-doc"

RDEPENDS:${PN} += ""

inherit rpm
