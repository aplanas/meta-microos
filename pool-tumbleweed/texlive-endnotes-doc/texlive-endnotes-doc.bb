SUMMARY = "Documentation for texlive-endnotes"
DESCRIPTION = "This package includes the documentation for texlive-endnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53319"

RPM_NAME = "texlive-endnotes-doc-2023.209.svn53319-54.2.noarch.rpm"
RPM_HASH = "9824d15b0d25bd91e69ad763b3c7b9ed59c3ac8ac393d4fab0701ae51421a3ea7b9f2b615f8f788bdfeb252dd15bbf20cba067af363f72b652e3928d84888b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
