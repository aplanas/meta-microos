SUMMARY = "Documentation for texlive-numerica-tables"
DESCRIPTION = "This package includes the documentation for texlive-numerica-tables"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn61288"

RPM_NAME = "texlive-numerica-tables-doc-2023.201.2.0.0svn61288-54.1.noarch.rpm"
RPM_HASH = "d897f0ec3327271a37032c6054af0c3f9aa682d0c2c43105f615a5884f6b0c098b4b73c534e23b48d66d048e2c415fcf87d2546dd034338e4245f3e0085a4a73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numerica-tables-doc"
RDEPENDS:${PN} += ""

inherit rpm
