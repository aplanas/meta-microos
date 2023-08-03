SUMMARY = "Documentation for texlive-pdfcrop"
DESCRIPTION = "This package includes the documentation for texlive-pdfcrop"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.40svn55435"

RPM_NAME = "texlive-pdfcrop-doc-2023.209.1.40svn55435-52.1.noarch.rpm"
RPM_HASH = "e64cef92d5ae4c22e3b386d5e776905ffde624782b34a5f3102d581cffd6200b5649687365261da1bf520c5ff67eff0f824ca7bd32ba25c299bd11ff1eb378ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcrop-doc"

RDEPENDS:${PN} += ""

inherit rpm
