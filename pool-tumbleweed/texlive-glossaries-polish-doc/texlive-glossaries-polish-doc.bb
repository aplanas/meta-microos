SUMMARY = "Documentation for texlive-glossaries-polish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-polish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-polish-doc-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "78f51fe9ecef0db2028a5d047e4d4b3754eb94377d442f34df85baaa67e2f2df66d8723fc4c3c40f9b195696d657296eab461ac6feb6ee0c03d2df9c66f8770c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-polish-doc"

RDEPENDS:${PN} += ""

inherit rpm
