SUMMARY = "Documentation for texlive-keyval2e"
DESCRIPTION = "This package includes the documentation for texlive-keyval2e"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.2svn23698"

RPM_NAME = "texlive-keyval2e-doc-2023.209.0.0.0.2svn23698-56.1.noarch.rpm"
RPM_HASH = "10dd274111f24214b7c97a3e3b3950ae94ea268c5d08afce0b462353e9606ed5dabc867cca93f966e1feb65d05779bf1837327be83ff913a38e9ccea8c0e28b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyval2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
