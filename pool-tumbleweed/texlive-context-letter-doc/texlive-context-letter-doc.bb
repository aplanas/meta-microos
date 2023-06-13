SUMMARY = "Documentation for texlive-context-letter"
DESCRIPTION = "This package includes the documentation for texlive-context-letter"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn60787"

RPM_NAME = "texlive-context-letter-doc-2023.204.svn60787-54.1.noarch.rpm"
RPM_HASH = "81df7a6eb65697715b6054bc738cc4b3e5dce43755f7251d123a91115cfb9789bc541ed48fcb1618113f9ec7d7038b6c85603225efb34693ad609f279fd71d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-letter-doc"

RDEPENDS:${PN} += ""

inherit rpm
