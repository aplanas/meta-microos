SUMMARY = "Documentation for texlive-uiucredborder"
DESCRIPTION = "This package includes the documentation for texlive-uiucredborder"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn29974"

RPM_NAME = "texlive-uiucredborder-doc-2023.209.1.00svn29974-54.1.noarch.rpm"
RPM_HASH = "de2e13e04fb625f6770678aaac91fefbf57851ccc022f478eac1fba98e0d18c16de33de01be84f236e3a471bc9899b7944949e36b5cb6fc4b667d79246f6d2cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uiucredborder-doc"

RDEPENDS:${PN} += ""

inherit rpm
