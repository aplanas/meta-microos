SUMMARY = "Data Plane Development Kit API documentation"
DESCRIPTION = "API programming documentation for the Data Plane Development Kit."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "22.11.1"

RPM_NAME = "dpdk-doc-22.11.1-2.9.noarch.rpm"
RPM_HASH = "7654c0df7fd7e644066c3e3a51c53dc2777ca87a9b574d6824f6e9903c0700e6dd808b25b846111379378c8d056b2a42b0886e22b221327df6c2298cf087e1b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpdk-any-doc \
dpdk-doc"

RDEPENDS:${PN} += ""

inherit rpm
