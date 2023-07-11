SUMMARY = "Documentation for texlive-mendex-doc"
DESCRIPTION = "This package includes the documentation for texlive-mendex-doc"
LICENSE = "BSD-3-Clause"

PV = "2023.208.svn62914"

RPM_NAME = "texlive-mendex-doc-doc-2023.208.svn62914-53.1.noarch.rpm"
RPM_HASH = "ac6db6908d6be3e83bba48210e4bada702a4f18878832b6e022417a8dee7373a1470b0dc427d1d9c43ee2dedb3606baa0eb5c0320b572d495c9e9b5b24384fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mendex-doc-doc-ja \
texlive-mendex-doc-doc"

RDEPENDS:${PN} += ""

inherit rpm
