SUMMARY = "Documentation for texlive-tikz-imagelabels"
DESCRIPTION = "This package includes the documentation for texlive-tikz-imagelabels"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn51490"

RPM_NAME = "texlive-tikz-imagelabels-doc-2023.209.0.0.2svn51490-53.1.noarch.rpm"
RPM_HASH = "e7973c9c2126786e55b70aa7e15b6afba2d2e2e11ca1c5458465fdacfee5cd994c35ae5c94912578b9581702767c15eca4e792ce7d705ac1ce32d3dd7c29aa5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-imagelabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
