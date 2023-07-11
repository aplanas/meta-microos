SUMMARY = "Documentation for texlive-quicktype"
DESCRIPTION = "This package includes the documentation for texlive-quicktype"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn42183"

RPM_NAME = "texlive-quicktype-doc-2023.201.0.0.1svn42183-53.2.noarch.rpm"
RPM_HASH = "65293889f8db029aeb072ec62ee157c8130a9b09572d8abe16c1edfd94fa18d2bef102b2389dbcd051397252d663d9e682270e971824a544ef72437bab4c320f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quicktype-doc"

RDEPENDS:${PN} += ""

inherit rpm
