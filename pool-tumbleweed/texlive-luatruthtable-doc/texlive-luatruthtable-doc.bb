SUMMARY = "Documentation for texlive-luatruthtable"
DESCRIPTION = "This package includes the documentation for texlive-luatruthtable"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn64508"

RPM_NAME = "texlive-luatruthtable-doc-2023.208.1.1svn64508-53.1.noarch.rpm"
RPM_HASH = "694eb08b9d3f07653158f01d3b96018e10e00ae6b95c479122461344ef1e2a326d757800ae764d7f13f60720846030e4500598ac104f68e4fee426583abca913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatruthtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
