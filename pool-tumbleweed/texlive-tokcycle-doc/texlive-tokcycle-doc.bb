SUMMARY = "Documentation for texlive-tokcycle"
DESCRIPTION = "This package includes the documentation for texlive-tokcycle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.42svn60320"

RPM_NAME = "texlive-tokcycle-doc-2023.201.1.42svn60320-52.1.noarch.rpm"
RPM_HASH = "bee102086c2055886efd80fa406cb6cfbbe78ccecae0f9e9652e9fa0df7f81eb8239b439b46aba875b7dff839ab1e83c1199e102c9b47ff8bdff09cff3d13bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tokcycle-doc"

RDEPENDS:${PN} += ""

inherit rpm
