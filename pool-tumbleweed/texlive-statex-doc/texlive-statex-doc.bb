SUMMARY = "Documentation for texlive-statex"
DESCRIPTION = "This package includes the documentation for texlive-statex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn20306"

RPM_NAME = "texlive-statex-doc-2023.201.1.6svn20306-57.1.noarch.rpm"
RPM_HASH = "02646d454f9de5a42f152acf938d9ac00a9d50c74a8170ee024cc37a824b9530e05e892f4fbab65ad9acdd731c1e0206d3c5936e84e5d221f356cb2319f790c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statex-doc"
RDEPENDS:${PN} += ""

inherit rpm
