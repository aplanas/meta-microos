SUMMARY = "Documentation for texlive-pst-spectra"
DESCRIPTION = "This package includes the documentation for texlive-pst-spectra"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn15878"

RPM_NAME = "texlive-pst-spectra-doc-2023.201.0.0.91svn15878-53.2.noarch.rpm"
RPM_HASH = "482e71c74c9bb345a4262207d1df56079f72e019f5942108c901b6a216cee6c3596b0f082c4c87a8de46d0647a63731d63fb8fb83c34beb70c712172a0045c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-spectra-doc-fr;en \
texlive-pst-spectra-doc"

RDEPENDS:${PN} += ""

inherit rpm
