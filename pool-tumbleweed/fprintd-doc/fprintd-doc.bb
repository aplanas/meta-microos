SUMMARY = "Development documents of fprintd"
DESCRIPTION = "This package contains Development documents for fprintd"
LICENSE = "GPL-2.0-or-later"

PV = "1.94.2"

RPM_NAME = "fprintd-doc-1.94.2-2.5.noarch.rpm"
RPM_HASH = "d4522c5f9b64a0829b02f82b36a151422517aacc3cc5d8046bc1afab53f8d4375404beefdd0bce9cd4bd12450482ac1727b3b618f55d3a2b98f4f2bb19a2ac53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fprintd-doc"

RDEPENDS:${PN} += "fprintd"

inherit rpm
