SUMMARY = "Documentation for texlive-powerdot"
DESCRIPTION = "This package includes the documentation for texlive-powerdot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn59272"

RPM_NAME = "texlive-powerdot-doc-2023.209.1.7svn59272-53.1.noarch.rpm"
RPM_HASH = "d70ca3a88e36ca3a48682aba959407c08fac5116e300f60f51180a72e15b51445ca952af4a709665ce768878b641d1d1452d042d872232e74c03495c13f3c0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-powerdot-doc-en;de \
texlive-powerdot-doc"

RDEPENDS:${PN} += ""

inherit rpm
