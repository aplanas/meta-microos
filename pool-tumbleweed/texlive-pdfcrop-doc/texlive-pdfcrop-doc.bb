SUMMARY = "Documentation for texlive-pdfcrop"
DESCRIPTION = "This package includes the documentation for texlive-pdfcrop"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.40svn55435"

RPM_NAME = "texlive-pdfcrop-doc-2023.201.1.40svn55435-51.1.noarch.rpm"
RPM_HASH = "951771ea113197d99938a069224bb9b1eadf4f1c5749056424bbddd9815031d1fe96910978ca3fc98beea256c6929cb39a90621f8880b9c143bb30fc23925d14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcrop-doc"

RDEPENDS:${PN} += ""

inherit rpm
