SUMMARY = "Documentation for texlive-ebezier"
DESCRIPTION = "This package includes the documentation for texlive-ebezier"
LICENSE = "LPPL-1.0"

PV = "2023.209.4svn15878"

RPM_NAME = "texlive-ebezier-doc-2023.209.4svn15878-54.2.noarch.rpm"
RPM_HASH = "e4b2378e317fe667d029fd6c2b629e1de3a6a441f039f510b0e80c0efa5a3f6076f01db4e574b5d9d58620933e2be44f882b6f40be039c934267278a77345e86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebezier-doc"

RDEPENDS:${PN} += ""

inherit rpm
