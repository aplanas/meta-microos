SUMMARY = "Documentation for texlive-nih"
DESCRIPTION = "This package includes the documentation for texlive-nih"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-nih-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "fb070813f2c2352eb61d71ace50c452eac29e73ffd7d252db523d01e73229555bee22967558167da3dd1a7554db8a2d882ace0612b268400b6cb6bc1cc9982d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nih-doc"

RDEPENDS:${PN} += ""

inherit rpm
