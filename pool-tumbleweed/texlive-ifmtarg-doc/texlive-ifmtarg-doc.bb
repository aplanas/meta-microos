SUMMARY = "Documentation for texlive-ifmtarg"
DESCRIPTION = "This package includes the documentation for texlive-ifmtarg"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn47544"

RPM_NAME = "texlive-ifmtarg-doc-2023.201.1.2bsvn47544-52.1.noarch.rpm"
RPM_HASH = "982dddcbd893e9b8026fe43b0f2960513419c2666205159ae9104add5cfeba2e32e1b48f819b635d0b2a0635369c150a5520e557c281a1988f91ea0c488e4142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifmtarg-doc"

RDEPENDS:${PN} += ""

inherit rpm
