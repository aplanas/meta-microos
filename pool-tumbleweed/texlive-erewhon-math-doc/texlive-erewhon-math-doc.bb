SUMMARY = "Documentation for texlive-erewhon-math"
DESCRIPTION = "This package includes the documentation for texlive-erewhon-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-doc-2023.201.0.0.56svn65684-53.1.noarch.rpm"
RPM_HASH = "4c9b1b6fe0a6f1bffdd5be19d0d0d9b968b67886014bb647310d67141d84ce82d322c2d902aec4674c4297697f3ff1f180eca7b0ac683e82561c3370535d4549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erewhon-math-doc"
RDEPENDS:${PN} += ""

inherit rpm
