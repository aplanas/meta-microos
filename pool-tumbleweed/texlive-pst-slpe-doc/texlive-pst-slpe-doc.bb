SUMMARY = "Documentation for texlive-pst-slpe"
DESCRIPTION = "This package includes the documentation for texlive-pst-slpe"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.31svn24391"

RPM_NAME = "texlive-pst-slpe-doc-2023.201.1.31svn24391-53.1.noarch.rpm"
RPM_HASH = "2c6a54950e873dde443414be053326b3062aedf134848f209bb6c091dc1f8eefaf98c2db74e3bf20486ddbef4d4e18bb284b76fec10488cc7168c8a4f1bfbd66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-slpe-doc"
RDEPENDS:${PN} += ""

inherit rpm
