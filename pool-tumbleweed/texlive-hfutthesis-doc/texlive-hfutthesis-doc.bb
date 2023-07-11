SUMMARY = "Documentation for texlive-hfutthesis"
DESCRIPTION = "This package includes the documentation for texlive-hfutthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.4svn64025"

RPM_NAME = "texlive-hfutthesis-doc-2023.201.1.0.4svn64025-53.2.noarch.rpm"
RPM_HASH = "eef910f56d8ddfc0cf6ef66d1335993432dba6e6fea9452778267b1992c0d568d661761f8ae2b4d4ccbef996a77997cc0572abf0188939ca156f0915fef104f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hfutthesis-doc-zh \
texlive-hfutthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
