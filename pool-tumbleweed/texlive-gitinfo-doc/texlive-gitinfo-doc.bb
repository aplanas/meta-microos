SUMMARY = "Documentation for texlive-gitinfo"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn34049"

RPM_NAME = "texlive-gitinfo-doc-2023.201.1.0svn34049-53.1.noarch.rpm"
RPM_HASH = "272be729e2d77e5ac653018759101500c7bbe257bed019d386149e0c931ea6f0b7e51cfafe7901710c29525b6da268942916e453a8eb882ee5109cb444316b48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
