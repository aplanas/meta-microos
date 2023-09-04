SUMMARY = "Documentation for texlive-pst-shell"
DESCRIPTION = "This package includes the documentation for texlive-pst-shell"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn56070"

RPM_NAME = "texlive-pst-shell-doc-2023.209.0.0.03svn56070-54.2.noarch.rpm"
RPM_HASH = "f422904ea601eac49d88d3ec14bf9c71636afa81764d46c11ce86c7e8f072e8b91353b3bee502b491cde1c0fe47bb5d4412eabb5182c93098cd2b1c43393f615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-shell-doc"

RDEPENDS:${PN} += ""

inherit rpm
