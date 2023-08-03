SUMMARY = "Documentation for texlive-soulpos"
DESCRIPTION = "This package includes the documentation for texlive-soulpos"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn60772"

RPM_NAME = "texlive-soulpos-doc-2023.209.1.2svn60772-58.1.noarch.rpm"
RPM_HASH = "79d5771e8bde3897844964517e68ff674738d8738439c963dd3c6de7b4d155f68390f86b4d8f4a3555915abe52a666256e429f39e14465df763d6661a4179956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soulpos-doc"

RDEPENDS:${PN} += ""

inherit rpm
