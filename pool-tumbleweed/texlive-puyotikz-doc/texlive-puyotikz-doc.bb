SUMMARY = "Documentation for texlive-puyotikz"
DESCRIPTION = "This package includes the documentation for texlive-puyotikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn57254"

RPM_NAME = "texlive-puyotikz-doc-2023.209.1.0.1svn57254-54.2.noarch.rpm"
RPM_HASH = "aa2c22f6eb01a6217ffa8d07f668bcfe93f75a6c9183950e6c76efc655c13c4f672b8c3ad44a3d0108a2eeb4b3adeca134a6b36fbba05f440aa9dfb36a3fb2c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-puyotikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
