SUMMARY = "Documentation for texlive-dviasm"
DESCRIPTION = "This package includes the documentation for texlive-dviasm"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64430"

RPM_NAME = "texlive-dviasm-doc-2023.201.svn64430-53.1.noarch.rpm"
RPM_HASH = "a840e684ef7ede57e6e839cd1b93c9eb87903383a9fbf316cb78b2576db140a5f3875c05f1c9b1e36921a6204bbc8c94d667493a98c968ebfe16ee2af17e4a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(dviasm.1) \
texlive-dviasm-doc"

RDEPENDS:${PN} += ""

inherit rpm
