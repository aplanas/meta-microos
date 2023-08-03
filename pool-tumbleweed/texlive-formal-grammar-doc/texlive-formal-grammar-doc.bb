SUMMARY = "Documentation for texlive-formal-grammar"
DESCRIPTION = "This package includes the documentation for texlive-formal-grammar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61955"

RPM_NAME = "texlive-formal-grammar-doc-2023.209.1.2svn61955-53.1.noarch.rpm"
RPM_HASH = "572276f134b1fb4d15d8f7e0a81292685c5068db8a903b24dccd0cc7153912161b334f3cbc982e4b3e897003342077652454942ad5e71f15536306368f12334e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formal-grammar-doc"

RDEPENDS:${PN} += ""

inherit rpm
