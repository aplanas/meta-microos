SUMMARY = "Documentation for texlive-juramisc"
DESCRIPTION = "This package includes the documentation for texlive-juramisc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn15878"

RPM_NAME = "texlive-juramisc-doc-2023.209.0.0.91svn15878-56.1.noarch.rpm"
RPM_HASH = "c5328dc98f78d7bcb7239cff22b7dfb134bfb5add7ddf0c193cad26ce2081aea5c5296b3ae25134865604acb6cc9905537d065ac7bef04d05d0a38396d3ca937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-juramisc-doc-de \
texlive-juramisc-doc"

RDEPENDS:${PN} += ""

inherit rpm
