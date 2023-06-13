SUMMARY = "Documentation for texlive-fcltxdoc"
DESCRIPTION = "This package includes the documentation for texlive-fcltxdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24500"

RPM_NAME = "texlive-fcltxdoc-doc-2023.201.1.0svn24500-52.1.noarch.rpm"
RPM_HASH = "ca33b57119a86c5b448d0a5253afc9364d38a161aa3801d6c92d7618d631db1b2fcf47f3b630c59c4a90df4a6009a8e3198a463c1bc22d3111057c6e1b0c47d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fcltxdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
