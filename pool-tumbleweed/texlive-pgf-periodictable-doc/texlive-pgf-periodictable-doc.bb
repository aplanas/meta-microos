SUMMARY = "Documentation for texlive-pgf-periodictable"
DESCRIPTION = "This package includes the documentation for texlive-pgf-periodictable"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn66010"

RPM_NAME = "texlive-pgf-periodictable-doc-2023.209.2.0.0svn66010-52.1.noarch.rpm"
RPM_HASH = "37310fcb5601d3c9a9d5e045bc4171744df57f73938736f9acb81cd27ecda244a01f8efe979a3c03f36736df5d087f4906f901b49cca696417577fdad677728c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-periodictable-doc"

RDEPENDS:${PN} += ""

inherit rpm
