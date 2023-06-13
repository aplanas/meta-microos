SUMMARY = "Documentation for texlive-efbox"
DESCRIPTION = "This package includes the documentation for texlive-efbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn33236"

RPM_NAME = "texlive-efbox-doc-2023.201.1.0svn33236-53.1.noarch.rpm"
RPM_HASH = "c7caaa115bcdeb869cbe6ac8c9b922d3511ac1b13e4ff23de3ddb7f4f8770cca9ea3a85b322087e0dedc54558235e1ee4ae62e8a8df0e08ab096bc27e28bcef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-efbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
