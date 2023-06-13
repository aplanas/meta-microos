SUMMARY = "Documentation for texlive-exercisebank"
DESCRIPTION = "This package includes the documentation for texlive-exercisebank"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn50448"

RPM_NAME = "texlive-exercisebank-doc-2023.201.0.0.3.0svn50448-52.1.noarch.rpm"
RPM_HASH = "66e34220802b109ad7d7c81b51eae863714ba0987d2ad2500ecc583abd8c7a49506af3b9602e831484b4772df2304f72eae8eb39d2251d8c934f17acb5d96466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercisebank-doc"

RDEPENDS:${PN} += ""

inherit rpm
