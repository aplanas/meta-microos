SUMMARY = "Documentation for aubio library"
DESCRIPTION = "This package includes the documentation for aubio library."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "aubio-docs-0.4.9-10.1.noarch.rpm"
RPM_HASH = "e07f4c08c1156d7cab542d2b4b65271be45218dbe43f4fb46d6a469ec3d594a38241faf16b0dc4b0d2418c820c33fe84f9920f89c6630b7d9148635d9506e485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aubio-docs"

RDEPENDS:${PN} += ""

inherit rpm
