SUMMARY = "Documentation for texlive-xetex-devanagari"
DESCRIPTION = "This package includes the documentation for texlive-xetex-devanagari"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn34296"

RPM_NAME = "texlive-xetex-devanagari-doc-2023.209.0.0.5svn34296-53.2.noarch.rpm"
RPM_HASH = "20fca09dfc26494b3332056029b7a6672a577b73500485a769e91b784c7bca235485a455b50bdc87e15326a944ab0c2e655d6e12cf54a6d20d483aee5e43fabe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-devanagari-doc"

RDEPENDS:${PN} += ""

inherit rpm
