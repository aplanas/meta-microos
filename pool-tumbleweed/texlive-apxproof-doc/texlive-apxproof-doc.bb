SUMMARY = "Documentation for texlive-apxproof"
DESCRIPTION = "This package includes the documentation for texlive-apxproof"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.4svn64715"

RPM_NAME = "texlive-apxproof-doc-2023.201.1.2.4svn64715-54.1.noarch.rpm"
RPM_HASH = "3b18548930f97e5a6dc2f9b860bff22fb9c200167e347674983535541f53b6dbad76bf3b4fce0476ab6d3c8ecc8e7971735f6844d3c39674914612d3f255ee96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apxproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
