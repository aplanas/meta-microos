SUMMARY = "Documentation for texlive-mkgrkindex"
DESCRIPTION = "This package includes the documentation for texlive-mkgrkindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn26313"

RPM_NAME = "texlive-mkgrkindex-doc-2023.201.2.0svn26313-54.1.noarch.rpm"
RPM_HASH = "508e9b9200c5e88f254e2ee33af2315cf532da1a6208f5a41b814a0a1d08c8ff833cf2cbfb46a4e5254a722905db144946526b38ece88746121cc5267786486b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkgrkindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
