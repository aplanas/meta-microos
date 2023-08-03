SUMMARY = "Documentation for texlive-persian-bib"
DESCRIPTION = "This package includes the documentation for texlive-persian-bib"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn37297"

RPM_NAME = "texlive-persian-bib-doc-2023.209.0.0.9svn37297-52.1.noarch.rpm"
RPM_HASH = "0ceab1496064e28b006b8aa6156b04585e652ce658303a873a15746554167a9e0b8871dd5e26b552b5ab0755da1294f04bc77c20788a1471201419c6615a7d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-persian-bib-doc-fa \
texlive-persian-bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
