SUMMARY = "Documentation for texlive-babel-turkish"
DESCRIPTION = "This package includes the documentation for texlive-babel-turkish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn51560"

RPM_NAME = "texlive-babel-turkish-doc-2023.201.1.4svn51560-53.1.noarch.rpm"
RPM_HASH = "f8dd791b38769a36bcddf7b54594447f92a85fd2e578eae8bcb70a3a6777bfd0d9f3081147c81777882707c3d7d09bc3960d049539ad851b78e748df67f30ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-turkish-doc"
RDEPENDS:${PN} += ""

inherit rpm
