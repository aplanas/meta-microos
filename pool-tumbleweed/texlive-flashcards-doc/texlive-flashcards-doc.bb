SUMMARY = "Documentation for texlive-flashcards"
DESCRIPTION = "This package includes the documentation for texlive-flashcards"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.2svn62104"

RPM_NAME = "texlive-flashcards-doc-2023.209.1.0.2svn62104-53.1.noarch.rpm"
RPM_HASH = "a0f4a86be22325a54eb6bcf0f39814ec9d839df2add9c452bb1417bce55c76e040c7d64330039790c2a0809405d811e3235975080569bf28a4e3aec5d1715ccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flashcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
