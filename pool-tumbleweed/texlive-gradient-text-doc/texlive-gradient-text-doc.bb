SUMMARY = "Documentation for texlive-gradient-text"
DESCRIPTION = "This package includes the documentation for texlive-gradient-text"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65567"

RPM_NAME = "texlive-gradient-text-doc-2023.201.1.2svn65567-53.2.noarch.rpm"
RPM_HASH = "a8fab5ef755f054b0f122e7bc765fa0e885e32e6d883e08bbabd85948a7dc24200d93dc399f0cf1af8267ed14dfc16689651662d1bc8877043515ac55ca6782c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradient-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
