SUMMARY = "Documentation for texlive-kerkis"
DESCRIPTION = "This package includes the documentation for texlive-kerkis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11svn56271"

RPM_NAME = "texlive-kerkis-doc-2023.201.1.11svn56271-55.1.noarch.rpm"
RPM_HASH = "67b916f137a93332b376dce8e50a0fb21a9d3ac4ee1ac19fcf4bcfb0ecbeccb87f9c6d269425c3d880df87b05f0fd523967d30f10359506a54a80d48c79d0254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kerkis-doc"
RDEPENDS:${PN} += ""

inherit rpm
