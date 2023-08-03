SUMMARY = "Documentation for texlive-biblatex-ajc2020unofficial"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ajc2020unofficial"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn54401"

RPM_NAME = "texlive-biblatex-ajc2020unofficial-doc-2023.209.0.0.2.0svn54401-54.1.noarch.rpm"
RPM_HASH = "cebdd5aec67a263f30c332499b875282bacd96881b00e8b1f2ae448f5b4c377649674e50ee486d1571d0b60f03392fad1b66269616599a8ebab9ee5ea9b598f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ajc2020unofficial-doc"

RDEPENDS:${PN} += ""

inherit rpm
