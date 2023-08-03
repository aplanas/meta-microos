SUMMARY = "Documentation for texlive-babel-friulan"
DESCRIPTION = "This package includes the documentation for texlive-babel-friulan"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn39861"

RPM_NAME = "texlive-babel-friulan-doc-2023.209.1.3svn39861-54.1.noarch.rpm"
RPM_HASH = "b6e1d52cd414c54ecb5e00cecadb8bb90efb746537e52f88f899bfea237293cd037b563595abd94b960ebe58035930599e09965cf37589b9d44ae3d4c5d1fb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-friulan-doc"

RDEPENDS:${PN} += ""

inherit rpm
