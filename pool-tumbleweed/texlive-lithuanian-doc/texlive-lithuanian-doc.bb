SUMMARY = "Documentation for texlive-lithuanian"
DESCRIPTION = "This package includes the documentation for texlive-lithuanian"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66461"

RPM_NAME = "texlive-lithuanian-doc-2023.201.svn66461-54.1.noarch.rpm"
RPM_HASH = "c0e1d712893bc32927780dfac0b2612f93cf3b21139e58b9d7559c6c4d6394334667b84390930a6ad4fcf2516ddd8272779719f8997c1f501fffa124f0d3f703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lithuanian-doc"

RDEPENDS:${PN} += ""

inherit rpm
