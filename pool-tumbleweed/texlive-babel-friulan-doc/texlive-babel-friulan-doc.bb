SUMMARY = "Documentation for texlive-babel-friulan"
DESCRIPTION = "This package includes the documentation for texlive-babel-friulan"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn39861"

RPM_NAME = "texlive-babel-friulan-doc-2023.201.1.3svn39861-53.1.noarch.rpm"
RPM_HASH = "2ddc496fdce361a18e082667dd1964a2773abd2c54912c16878e66362a0b26acb69f716ff76f0ffb6db053fd41fea16041e4c77aa2941935b75ddc1000c5f98b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-friulan-doc"

RDEPENDS:${PN} += ""

inherit rpm
