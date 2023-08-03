SUMMARY = "Documentation for texlive-pspicture"
DESCRIPTION = "This package includes the documentation for texlive-pspicture"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pspicture-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "f6b976034e2437d70d7752ed3dda58024d24f0e65921a69407f116f7288f19e68c314596332f392248fa7709e89dfd5242aad002d3562c7a22cad343716dffdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pspicture-doc"

RDEPENDS:${PN} += ""

inherit rpm
