SUMMARY = "Documentation for texlive-minifp"
DESCRIPTION = "This package includes the documentation for texlive-minifp"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.96svn32559"

RPM_NAME = "texlive-minifp-doc-2023.201.0.0.96svn32559-54.1.noarch.rpm"
RPM_HASH = "c4ce3fbfe58d71a09a100ecb8b424efb4d8c4711077ce6fa2c71336670cb55d61f7fc510bd6ca184175de12a0172052bdc46d168a07d267ed093cbf8d7697bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minifp-doc"

RDEPENDS:${PN} += ""

inherit rpm
