SUMMARY = "Documentation for texlive-bmstu-iu8"
DESCRIPTION = "This package includes the documentation for texlive-bmstu-iu8"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61937"

RPM_NAME = "texlive-bmstu-iu8-doc-2023.209.1.2svn61937-53.1.noarch.rpm"
RPM_HASH = "1fa9f5b86a6a3f6915925d1fc8ea88138d27fa677005deebe5640176d1316dd5ffb5dec9a7c67b60ed18859f96b1fa48d6cd0cf0a0d5d6e764f56111557d07fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bmstu-iu8-doc-ru \
texlive-bmstu-iu8-doc"

RDEPENDS:${PN} += ""

inherit rpm
