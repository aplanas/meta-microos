SUMMARY = "Documentation for texlive-logicpuzzle"
DESCRIPTION = "This package includes the documentation for texlive-logicpuzzle"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5svn34491"

RPM_NAME = "texlive-logicpuzzle-doc-2023.201.2.5svn34491-54.1.noarch.rpm"
RPM_HASH = "9bf46e9be189d548b6a620bd052191aa0d7fc46a9113c27a25cd003b547c74bbf14464191a14fea7e72646c8ebf12c784184bae091d98d109dc1dd85bc835142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logicpuzzle-doc"

RDEPENDS:${PN} += ""

inherit rpm
