SUMMARY = "Data Plane Development Kit API documentation"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-doc-22.11.1-2.8.noarch.rpm"
RPM_HASH = "9b0695e7adef75c616989d9067d347183c43629c550feb1977224a334772e203f5c06f663c6b63f3465e8bcb6d2d994a2507682431d6f249b0275cc5533bdfb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
