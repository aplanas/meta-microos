SUMMARY = "Documentation for texlive-pst2pdf"
DESCRIPTION = "This package includes the documentation for texlive-pst2pdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.20svn56172"

RPM_NAME = "texlive-pst2pdf-doc-2023.201.0.0.20svn56172-53.2.noarch.rpm"
RPM_HASH = "13dc9e7da6437da61ae98aaab41b9c4f5e6242d79449d5e44365921e196e616be68c33f31dbc5ab2330d0f8b5e87015cd527674777727c8fa9dcaef97ef24afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst2pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
