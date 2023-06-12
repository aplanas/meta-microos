SUMMARY = "Documentation for texlive-hrlatex"
DESCRIPTION = "This package includes the documentation for texlive-hrlatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.23svn18020"

RPM_NAME = "texlive-hrlatex-doc-2023.201.0.0.23svn18020-52.1.noarch.rpm"
RPM_HASH = "b9e05f670e804dec8b0a70798e67f22837e5057a1222a0cfab132dc41521ad183feb628e33b73f7a7272a3b1c314dedc258928951c0b3be7c937062365118f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hrlatex-doc:hr) \
texlive-hrlatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
