SUMMARY = "Documentation for texlive-glossaries-slovene"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-slovene"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51211"

RPM_NAME = "texlive-glossaries-slovene-doc-2023.201.1.0svn51211-53.1.noarch.rpm"
RPM_HASH = "6089348848a526186178876181e88637bea0c9e14fa706caed37bc0342b7182e7d569f8cb883df2c7f0c16253bd688eef19d3c5ae320e4aa64b288c697ba2ef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-slovene-doc"

RDEPENDS:${PN} += ""

inherit rpm
