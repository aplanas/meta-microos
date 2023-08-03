SUMMARY = "Documentation for texlive-serbian-lig"
DESCRIPTION = "This package includes the documentation for texlive-serbian-lig"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53127"

RPM_NAME = "texlive-serbian-lig-doc-2023.209.svn53127-54.1.noarch.rpm"
RPM_HASH = "b78871e1048f31fcea1147a689aba5fd744b22b71236329ab1ff1fad313bab45c5c5cf7225fb4681aba4d6b41c0f4ca9ae723044c163ac72b9604c17e02c8989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-lig-doc"

RDEPENDS:${PN} += ""

inherit rpm
