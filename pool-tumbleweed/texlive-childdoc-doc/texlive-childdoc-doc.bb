SUMMARY = "Documentation for texlive-childdoc"
DESCRIPTION = "This package includes the documentation for texlive-childdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn49543"

RPM_NAME = "texlive-childdoc-doc-2023.201.2.0svn49543-53.1.noarch.rpm"
RPM_HASH = "08a7fe532c3e8ceaab470cb56b5b53c6fd72707db2b2456fc8fc396d2b9c22e569b68a16dda0663363dcce7cf6566d7f4814921480cd0f9fa3e438c6f43aaeb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-childdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
