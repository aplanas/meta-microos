SUMMARY = "Documentation for texlive-fc"
DESCRIPTION = "This package includes the documentation for texlive-fc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn32796"

RPM_NAME = "texlive-fc-doc-2023.201.1.4svn32796-52.1.noarch.rpm"
RPM_HASH = "d8dc6d9a00546712ae36f85b4e568c9248ee2363aa7abf13eaefe1c3e6b0d0c472135451f869c247b5b755475f6d4e7cf6bf7e43e18c1a355626aedee851f307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fc-doc"

RDEPENDS:${PN} += ""

inherit rpm
