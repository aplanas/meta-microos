SUMMARY = "Documentation for texlive-yinit-otf"
DESCRIPTION = "This package includes the documentation for texlive-yinit-otf"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-doc-2023.209.1.0svn40207-53.1.noarch.rpm"
RPM_HASH = "468cb26cfdc15a2b9ab5cb40f5176c9324aa5b7ff75608ca226fef36230b5215b3ff67655dea228a8bd02a87c2a278f1f513cd29cd52f6b765748322c59c6bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yinit-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
