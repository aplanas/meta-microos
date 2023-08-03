SUMMARY = "Documentation for texlive-bib2gls"
DESCRIPTION = "This package includes the documentation for texlive-bib2gls"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.2svn65104"

RPM_NAME = "texlive-bib2gls-doc-2023.209.3.2svn65104-54.1.noarch.rpm"
RPM_HASH = "d8e188be62ee7df86ff2392af9c222f98b4735fb5e987ab94dcf8810b1e1e4ecab7783807c0971e040c38f25a3e6bc68773c3cc1b70e27657c700ae65ec49c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bib2gls.1 \
man-convertgls2bib.1 \
texlive-bib2gls-doc"

RDEPENDS:${PN} += ""

inherit rpm
