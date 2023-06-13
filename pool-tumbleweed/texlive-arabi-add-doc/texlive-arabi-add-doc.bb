SUMMARY = "Documentation for texlive-arabi-add"
DESCRIPTION = "This package includes the documentation for texlive-arabi-add"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn37709"

RPM_NAME = "texlive-arabi-add-doc-2023.201.1.0svn37709-54.1.noarch.rpm"
RPM_HASH = "05fa465764cdd9389ba443693812e31153899e4329735a3373b2fd76e56d605ca6caf7f6827d872cc4ce72d9a7fad5b577d1166b9f83401b75a3402484638eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabi-add-doc"

RDEPENDS:${PN} += ""

inherit rpm
