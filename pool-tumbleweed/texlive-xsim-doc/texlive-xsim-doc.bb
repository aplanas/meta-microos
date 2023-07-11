SUMMARY = "Documentation for texlive-xsim"
DESCRIPTION = "This package includes the documentation for texlive-xsim"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn61988"

RPM_NAME = "texlive-xsim-doc-2023.201.0.0.21svn61988-52.2.noarch.rpm"
RPM_HASH = "d71b5860789a9ee2bc19e34023a33a913c5dbbce89d5890d6077511cefacb810ee97009674203938a45f643b0bd57548af396604b634327246e7e119547fda92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsim-doc"

RDEPENDS:${PN} += ""

inherit rpm
