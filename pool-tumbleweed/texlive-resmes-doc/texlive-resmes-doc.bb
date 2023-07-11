SUMMARY = "Documentation for texlive-resmes"
DESCRIPTION = "This package includes the documentation for texlive-resmes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65375"

RPM_NAME = "texlive-resmes-doc-2023.201.1.0svn65375-53.2.noarch.rpm"
RPM_HASH = "0ecffa6e3b61abc3b7393808d411b011fb7b936c2eeddcc692df1250c3f6e95cd9feda92e662cca98ab4c4fc130993e48e1077a14cce13115d84856d073de8e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resmes-doc"

RDEPENDS:${PN} += ""

inherit rpm
