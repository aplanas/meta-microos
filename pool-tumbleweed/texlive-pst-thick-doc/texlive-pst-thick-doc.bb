SUMMARY = "Documentation for texlive-pst-thick"
DESCRIPTION = "This package includes the documentation for texlive-pst-thick"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn16369"

RPM_NAME = "texlive-pst-thick-doc-2023.201.1.0svn16369-53.2.noarch.rpm"
RPM_HASH = "dd64757b6086197f232b899dd57f5e2fe7034cab396d29c6ad322fbd82bd36e486bea8ef9c806bc10a4b60d70885c22abe4e44e33866c1e9fd916f75f44726ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-thick-doc-fr \
texlive-pst-thick-doc"

RDEPENDS:${PN} += ""

inherit rpm
