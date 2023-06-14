SUMMARY = "Documentation for texlive-ifsym"
DESCRIPTION = "This package includes the documentation for texlive-ifsym"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24868"

RPM_NAME = "texlive-ifsym-doc-2023.201.svn24868-52.1.noarch.rpm"
RPM_HASH = "6f158bc703352e233e5d9c1da7e6495b0c1b11b6719467485b81d84fdb455c80351afe4f6f9ad21f5bee314d024157b7bb45ab26cd09fa356be983a72fc71aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ifsym-doc-de \
texlive-ifsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
