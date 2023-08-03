SUMMARY = "Documentation for texlive-fmp"
DESCRIPTION = "This package includes the documentation for texlive-fmp"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-fmp-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "07b11112c8fd0a2c9a4e9da43f102106cdb13e5229e2ba9d1928c59b3b53494c55f365db9fd53b4f3bca56ebb364020e40a72690c6eeb38bb96bd4277d50d80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
