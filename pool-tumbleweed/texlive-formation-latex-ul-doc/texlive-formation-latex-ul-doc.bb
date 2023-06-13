SUMMARY = "Documentation for texlive-formation-latex-ul"
DESCRIPTION = "This package includes the documentation for texlive-formation-latex-ul"
LICENSE = "LPPL-1.0"

PV = "2023.201.2020.10svn56714"

RPM_NAME = "texlive-formation-latex-ul-doc-2023.201.2020.10svn56714-52.1.noarch.rpm"
RPM_HASH = "2a0e261b56c78cf20206d4c26a971188aba355283fb818f838d8244f88252b6f7da1b728a39c47ecfcdaf9a433e4e4607acf8421d5977f47930144b4425fbe1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-formation-latex-ul-doc:fr) \
texlive-formation-latex-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
