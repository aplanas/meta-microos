SUMMARY = "Documentation for texlive-xetex-itrans"
DESCRIPTION = "This package includes the documentation for texlive-xetex-itrans"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn55475"

RPM_NAME = "texlive-xetex-itrans-doc-2023.209.4.2svn55475-53.2.noarch.rpm"
RPM_HASH = "a60f3d6334096d652644e95069bfbdaf823f27172fa25f1b39cc4e94cc8876d47aee2682894be7a720b45b326ef97c87aefe66c774fccc912ad43eb7f03d0fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-itrans-doc"

RDEPENDS:${PN} += ""

inherit rpm
