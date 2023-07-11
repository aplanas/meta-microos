SUMMARY = "Documentation for texlive-hfbright"
DESCRIPTION = "This package includes the documentation for texlive-hfbright"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-hfbright-doc-2023.201.svn29349-53.2.noarch.rpm"
RPM_HASH = "2c03de5cc8b526a727a3f820424c282a68063dbf32dc1b6e86a2134873916ab046bf00355c33d1dbe36f095e16db591dfb85d2c05db1c5e9cbb7dbf7bcac60ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfbright-doc"

RDEPENDS:${PN} += ""

inherit rpm
