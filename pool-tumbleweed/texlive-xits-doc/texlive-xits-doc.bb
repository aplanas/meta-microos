SUMMARY = "Documentation for texlive-xits"
DESCRIPTION = "This package includes the documentation for texlive-xits"
LICENSE = "OFL-1.1"

PV = "2023.201.1.302svn55730"

RPM_NAME = "texlive-xits-doc-2023.201.1.302svn55730-52.2.noarch.rpm"
RPM_HASH = "395df76fac264f8feacfff18f6e77021fa21da57c652c310c13ee104209b79d5ff5191b48598b74c9cd0afd45b1fa2d18ea178b3d0b35bf6fb9adbb1664ba001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xits-doc"

RDEPENDS:${PN} += ""

inherit rpm
