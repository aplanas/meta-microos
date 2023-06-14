SUMMARY = "Documentation for texlive-enctex"
DESCRIPTION = "This package includes the documentation for texlive-enctex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn34957"

RPM_NAME = "texlive-enctex-doc-2023.201.svn34957-53.1.noarch.rpm"
RPM_HASH = "0192d560bdd5ac21115c6063380d52b9024c3a46b0e3f9c4fb700ca19bed0d593e664ada33948d5341d94753d394a345c58a5524c85ed93a5024c88cff60bf98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-enctex-doc-en;cs \
texlive-enctex-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
