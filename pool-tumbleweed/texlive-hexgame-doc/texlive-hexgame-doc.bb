SUMMARY = "Documentation for texlive-hexgame"
DESCRIPTION = "This package includes the documentation for texlive-hexgame"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hexgame-doc-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "9441be64cb09c3617beb64590519bce6537b4d60325b6aad1e19b8c0443f8c9837bdb44bf3fe0ba4ad6afa945de7928a76b9e550a08b6ddd0105304e66197c1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hexgame-doc"

RDEPENDS:${PN} += ""

inherit rpm
