SUMMARY = "Documentation for texlive-glosmathtools"
DESCRIPTION = "This package includes the documentation for texlive-glosmathtools"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn55920"

RPM_NAME = "texlive-glosmathtools-doc-2023.209.1.0.0svn55920-54.2.noarch.rpm"
RPM_HASH = "caf8ef509e1001432dbd4492b5b6f78bfbe990a42dd720a59431327456f1d39167fb23a1793ad54f86962ba3b3a4adcdfac084ea6de93a1715e871f8df9754c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-glosmathtools-doc-fr \
texlive-glosmathtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
