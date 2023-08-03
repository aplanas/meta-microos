SUMMARY = "Documentation for texlive-minted"
DESCRIPTION = "This package includes the documentation for texlive-minted"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn65252"

RPM_NAME = "texlive-minted-doc-2023.209.2.7svn65252-55.1.noarch.rpm"
RPM_HASH = "80cf818321cf6dfd0b2e5c9e7bcaf5a26fbbeef14cb908934702bdcd853af6fb54273ab6f4e9fb69fabd3fde84a476577ed52f495be9dcd18203df75631b2e57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minted-doc"

RDEPENDS:${PN} += ""

inherit rpm
