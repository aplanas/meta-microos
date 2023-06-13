SUMMARY = "Documentation for texlive-tikz-nef"
DESCRIPTION = "This package includes the documentation for texlive-tikz-nef"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn55920"

RPM_NAME = "texlive-tikz-nef-doc-2023.201.0.0.1svn55920-52.1.noarch.rpm"
RPM_HASH = "b3d6aee36635e53fdcd74384e96b8975fe9d4576a14393542c6a4e1b50729ba96afa1d53b5068e329e70a36fbfd00590baa2048d2727b710f8e49a40be6cf49c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-nef-doc"

RDEPENDS:${PN} += ""

inherit rpm
