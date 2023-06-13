SUMMARY = "Documentation, examples and demos for PDAL"
DESCRIPTION = "This package provides the documentation and sources of examples and data demos of \
PDAL algorithms."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.3.0"

RPM_NAME = "PDAL-doc-2.3.0-2.15.noarch.rpm"
RPM_HASH = "b69f792d3f7b07f23b9dd28105dec0f565a25aaee8408d691e69713fac5b5bf2623391d2b6b0b73aff5213bf9dc5c800f363c893fea28c0a91a2c732618a1efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PDAL-doc"

RDEPENDS:${PN} += ""

inherit rpm
