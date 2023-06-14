SUMMARY = "Documentation for texlive-beamer2thesis"
DESCRIPTION = "This package includes the documentation for texlive-beamer2thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn27539"

RPM_NAME = "texlive-beamer2thesis-doc-2023.201.2.2svn27539-53.1.noarch.rpm"
RPM_HASH = "02accbd7b73530468491556efc40f170493d22c5a93e857868a33e83b112b48526dfb7b5854b3490868f7cabeb039b7fdcee1cef07752f0a7abaea7514e0a92b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-beamer2thesis-doc-en;it \
texlive-beamer2thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
