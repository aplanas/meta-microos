SUMMARY = "Documentation for texlive-footnoterange"
DESCRIPTION = "This package includes the documentation for texlive-footnoterange"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn66149"

RPM_NAME = "texlive-footnoterange-doc-2023.201.1.1asvn66149-52.1.noarch.rpm"
RPM_HASH = "f42129c4018d86bc75d3a4f8c0b9132426a12a9ee36413f15143870a3f869a520722b9ab58abacf7ae1ddb05668da3104718ab81feb0a3f68f775cefb2e0ff2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnoterange-doc"

RDEPENDS:${PN} += ""

inherit rpm
