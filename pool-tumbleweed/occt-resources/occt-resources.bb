SUMMARY = "Binary resource files for occt"
DESCRIPTION = "This package contains resource files imported from the libraries."
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "occt-resources-7.7.0-1.3.noarch.rpm"
RPM_HASH = "8999ddfa3b1bc4969e8ea9dd7fa34adfcc857a832d4756c0c57c023cbd3fce1b3c1610e7b490551562b6706cb2859c4a562be1a5d1837824c312e1c87d949535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "occt-resources"

RDEPENDS:${PN} += ""

inherit rpm
