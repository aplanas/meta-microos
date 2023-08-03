SUMMARY = "Documentation for texlive-biblatex-bath"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bath"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0svn63401"

RPM_NAME = "texlive-biblatex-bath-doc-2023.209.6.0svn63401-54.1.noarch.rpm"
RPM_HASH = "3a49417a52107d8231c4ada4e5a60760f8d9caf8aa510ecd78ccdd021849515b8a68971dd977272417866c545c1aea0f1cee517ca7425f35d5dcc0cc146840d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bath-doc"

RDEPENDS:${PN} += ""

inherit rpm
