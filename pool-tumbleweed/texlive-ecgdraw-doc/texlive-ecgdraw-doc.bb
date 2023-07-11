SUMMARY = "Documentation for texlive-ecgdraw"
DESCRIPTION = "This package includes the documentation for texlive-ecgdraw"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn41617"

RPM_NAME = "texlive-ecgdraw-doc-2023.201.0.0.1svn41617-53.2.noarch.rpm"
RPM_HASH = "bd493ecbab5992aecff6c40228cfb2851aba4f31e76652e9cd3eb66ad6d7619652613a5778e215ddf0a2a2bf6fdc845229c6fd4ab8d9847d13c5ebf18f0deb35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ecgdraw-doc-it \
texlive-ecgdraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
