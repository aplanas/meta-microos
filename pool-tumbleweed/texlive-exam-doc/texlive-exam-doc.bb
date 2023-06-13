SUMMARY = "Documentation for texlive-exam"
DESCRIPTION = "This package includes the documentation for texlive-exam"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn64134"

RPM_NAME = "texlive-exam-doc-2023.201.2.7svn64134-52.1.noarch.rpm"
RPM_HASH = "61e43134e4d155819717bad84dfd6766e0e26162af81576629bdfcf62aa3cc76d39eaade90f95f93e7ca6473016f4f2df4878ff0e2becc0620773089a940f39e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-doc"

RDEPENDS:${PN} += ""

inherit rpm
