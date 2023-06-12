SUMMARY = "Documentation for texlive-biblatex-vancouver"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-vancouver"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn55339"

RPM_NAME = "texlive-biblatex-vancouver-doc-2023.201.0.0.1svn55339-53.1.noarch.rpm"
RPM_HASH = "0b307f1f9e56b2cd1b8f2b81baefcb21e64c42b0979db125895fd3921fd4fccb8331445fa28bae64cff626a62376330262b08a25a29b1f53976ff06c29ecbd21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-vancouver-doc"
RDEPENDS:${PN} += ""

inherit rpm
