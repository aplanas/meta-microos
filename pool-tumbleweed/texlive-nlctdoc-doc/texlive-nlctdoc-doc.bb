SUMMARY = "Documentation for texlive-nlctdoc"
DESCRIPTION = "This package includes the documentation for texlive-nlctdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.08svn64708"

RPM_NAME = "texlive-nlctdoc-doc-2023.209.1.08svn64708-55.1.noarch.rpm"
RPM_HASH = "8e80dc93e07588253398b6a928544f60194fce94c2ba3f05fa71bc83ce19dbe3eb2e4664209d11fec7d4684876aea78cfc64f2b3f6f8ae8ab097db75b643fa49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nlctdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
