SUMMARY = "Documentation for texlive-pst-spectra"
DESCRIPTION = "This package includes the documentation for texlive-pst-spectra"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn15878"

RPM_NAME = "texlive-pst-spectra-doc-2023.209.0.0.91svn15878-54.2.noarch.rpm"
RPM_HASH = "85347961970d0c1f1864fc2699316aa95d83181b4ef2da512eb2f6c661ab36568af119292291b24ea3de59b1899cc72eee0957bc9104e013006a53e010edd10b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-spectra-doc-fr;en \
texlive-pst-spectra-doc"

RDEPENDS:${PN} += ""

inherit rpm
