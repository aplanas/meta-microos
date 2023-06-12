SUMMARY = "Documentation for texlive-lni"
DESCRIPTION = "This package includes the documentation for texlive-lni"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn58061"

RPM_NAME = "texlive-lni-doc-2023.201.1.7svn58061-54.1.noarch.rpm"
RPM_HASH = "42ef79f8633722f9b02715816cf7e2d83a4d3713262c301b9230431b23e24054171c673f61cd59a9930f268efbe30abddf5b9d84104f571e3c17f567f1f5b187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lni-doc"
RDEPENDS:${PN} += ""

inherit rpm
