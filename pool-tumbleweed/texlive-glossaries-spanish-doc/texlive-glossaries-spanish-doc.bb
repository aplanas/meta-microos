SUMMARY = "Documentation for texlive-glossaries-spanish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-spanish-doc-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "036a4f65a085ec20a440b559f6de0e5a906d04356dd4c0fc4199d467fc36d24b4852493aea0ac802451ed23f85213e93542b6c7971eae0f0d8a965adc9ef7cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
