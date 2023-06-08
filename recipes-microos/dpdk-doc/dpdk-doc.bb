SUMMARY = "Data Plane Development Kit API documentation"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-doc-22.11.1-2.1.noarch.rpm"
RPM_HASH = "354f22bdc62f902e459d062c5b69dd7242e8b9e1838b2b2d2a648b0d0a37fb678bbde39e7bef6136f537f70e24ffcf34daeef01d32c82f2b4988533dcba7f490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc dpdk-doc"
RDEPENDS:${PN} += ""

inherit rpm
