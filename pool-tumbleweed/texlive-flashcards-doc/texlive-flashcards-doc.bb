SUMMARY = "Documentation for texlive-flashcards"
DESCRIPTION = "This package includes the documentation for texlive-flashcards"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0.2svn62104"

RPM_NAME = "texlive-flashcards-doc-2023.201.1.0.2svn62104-52.1.noarch.rpm"
RPM_HASH = "40e67f832ab20a9df009bf093c638e54d760dbfe9f68a729ad03475492150229b6cb021295e2750de905ab1534100a12604e8cdfcd9aa031e7362b11fa5dc0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flashcards-doc"
RDEPENDS:${PN} += ""

inherit rpm
