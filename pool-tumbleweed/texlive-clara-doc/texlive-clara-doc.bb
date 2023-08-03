SUMMARY = "Documentation for texlive-clara"
DESCRIPTION = "This package includes the documentation for texlive-clara"
LICENSE = "OFL-1.1"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-clara-doc-2023.209.svn54512-54.1.noarch.rpm"
RPM_HASH = "36b1e6122f4d4dda0bac5d239276528d8d7ff8487d15ef6408027cd4e9557cb316758235144997ccd8bcf048697c3874d68a3ba2f6b6a4f14895351119509273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clara-doc"

RDEPENDS:${PN} += ""

inherit rpm
