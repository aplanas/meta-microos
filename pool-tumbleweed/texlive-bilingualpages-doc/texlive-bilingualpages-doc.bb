SUMMARY = "Documentation for texlive-bilingualpages"
DESCRIPTION = "This package includes the documentation for texlive-bilingualpages"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn59643"

RPM_NAME = "texlive-bilingualpages-doc-2023.201.1.0.0svn59643-53.1.noarch.rpm"
RPM_HASH = "262ee328ea18e35296187b50789c4c0dd78c5e1517e8c780eb267c9b4a07432672741cd8f2fbf6f8776885a72978aa7b49f82d93c50a9096d71adc2c7f2019df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bilingualpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
