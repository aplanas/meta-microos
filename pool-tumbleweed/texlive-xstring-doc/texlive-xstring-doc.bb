SUMMARY = "Documentation for texlive-xstring"
DESCRIPTION = "This package includes the documentation for texlive-xstring"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.85svn65551"

RPM_NAME = "texlive-xstring-doc-2023.209.1.85svn65551-53.1.noarch.rpm"
RPM_HASH = "dd0f755ce9cf8099ed5899ee24cb54c8d529cfb529c9d1e897ae6972198e839c862a91918590c938bcfa837110fdcf43501988e2e45af16b56d3bdf10ab43004"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xstring-doc-en;fr \
texlive-xstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
