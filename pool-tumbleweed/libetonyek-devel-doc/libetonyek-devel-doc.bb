SUMMARY = "Documentation for the libetonyek API"
DESCRIPTION = "This package contains documentation for the libetonyek API."
LICENSE = "MPL-2.0"

PV = "0.1.10"

RPM_NAME = "libetonyek-devel-doc-0.1.10-1.11.noarch.rpm"
RPM_HASH = "f8b4cbd2dd963f01b1d3af5f373644736264df656956e2cc400818719ec00c322f26d2c7e69e1804f769a4912cffaadc5ec4188f7f69572999db93bd2a69916f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libetonyek-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
