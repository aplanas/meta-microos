SUMMARY = "Documentation for texlive-context-fancybreak"
DESCRIPTION = "This package includes the documentation for texlive-context-fancybreak"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-fancybreak-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "97d80aea07493cca23c7a12bc5db0191656dc8acf6d915a5e68c454f28ee91cf0b49641294b4e6c2d2ac3a4335b9553a69f0a5cd8bdfa113073cf46ad1643d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-fancybreak-doc"

RDEPENDS:${PN} += ""

inherit rpm
