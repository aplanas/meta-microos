SUMMARY = "Documentation for texlive-pgf-interference"
DESCRIPTION = "This package includes the documentation for texlive-pgf-interference"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn61562"

RPM_NAME = "texlive-pgf-interference-doc-2023.209.0.0.1svn61562-52.1.noarch.rpm"
RPM_HASH = "92f2f646884982f4825a352641c586e898f9982e87136e37650c198ca52dd82f2828bf69308ccae230f4ac7e3f65d09d8cdd872d79d4e0ea982ffbbbab7abeb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pgf-interference-doc-de;en \
texlive-pgf-interference-doc"

RDEPENDS:${PN} += ""

inherit rpm
