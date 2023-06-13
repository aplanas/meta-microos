SUMMARY = "Documentation for texlive-fvextra"
DESCRIPTION = "This package includes the documentation for texlive-fvextra"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn65158"

RPM_NAME = "texlive-fvextra-doc-2023.201.1.5svn65158-52.1.noarch.rpm"
RPM_HASH = "76d2e55694c02b0c42a35864a2aaf0f1f34351975b01de86db847d938636e3e020b2c38c55c74153a374745d8603f47ca0f0efc5141adf550b72ef5f9e40c17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fvextra-doc"

RDEPENDS:${PN} += ""

inherit rpm
