SUMMARY = "Data Plane Development Kit API documentation"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-doc-22.11.1-2.12.noarch.rpm"
RPM_HASH = "abdd89d643a466634dc08266f9d4a28bea08af7d6f3d8d64b065574edba2e621c655611becfe62829ce1e8924e0e0073c60f26ea1420368a344d129792f9ab25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
