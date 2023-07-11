SUMMARY = "Documentation for texlive-macroswap"
DESCRIPTION = "This package includes the documentation for texlive-macroswap"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn31498"

RPM_NAME = "texlive-macroswap-doc-2023.208.1.1svn31498-53.1.noarch.rpm"
RPM_HASH = "45a5ccc8e2add7990caecce4ba121170230850b1c46cfcaa723979fa54acce3ac5853e9b6e3498a2219df76e317aab9589b61ea247fa5537ee3399648beefb38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-macroswap-doc"

RDEPENDS:${PN} += ""

inherit rpm
