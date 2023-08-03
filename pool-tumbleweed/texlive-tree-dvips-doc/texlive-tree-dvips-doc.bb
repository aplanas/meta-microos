SUMMARY = "Documentation for texlive-tree-dvips"
DESCRIPTION = "This package includes the documentation for texlive-tree-dvips"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn21751"

RPM_NAME = "texlive-tree-dvips-doc-2023.209.0.0.91svn21751-53.1.noarch.rpm"
RPM_HASH = "3a820279b81ff98a1e0f02a56690943464750c8ecdfb861d2ed2f1c51a59da3ae9385a05607275dd78b6f5fcff89210981a08204ef832d49c5b0f5b8e3272384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tree-dvips-doc"

RDEPENDS:${PN} += ""

inherit rpm
