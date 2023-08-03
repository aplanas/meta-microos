SUMMARY = "Documentation for texlive-duckuments"
DESCRIPTION = "This package includes the documentation for texlive-duckuments"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn52271"

RPM_NAME = "texlive-duckuments-doc-2023.209.0.0.5svn52271-53.1.noarch.rpm"
RPM_HASH = "43a94daf7e761fe16781ee168d737abf515b4a802ca9f9c0302974ad1228efcf056b6d88f402c1ae21dc84c8e664b8a3a2e7382e1d185da5225ef2d19e2aa4c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duckuments-doc"

RDEPENDS:${PN} += ""

inherit rpm
