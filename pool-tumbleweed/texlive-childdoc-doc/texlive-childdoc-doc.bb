SUMMARY = "Documentation for texlive-childdoc"
DESCRIPTION = "This package includes the documentation for texlive-childdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn49543"

RPM_NAME = "texlive-childdoc-doc-2023.209.2.0svn49543-54.1.noarch.rpm"
RPM_HASH = "e2ef11e861a126030d3fd0a7b79db7538783d7c5165de420a9df5d5626436f2bffe1cd7623048f3ebe2e49ba3162fc2f21d0027fa7510a9af98c88855af42b21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-childdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
