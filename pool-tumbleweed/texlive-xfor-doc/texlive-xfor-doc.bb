SUMMARY = "Documentation for texlive-xfor"
DESCRIPTION = "This package includes the documentation for texlive-xfor"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn15878"

RPM_NAME = "texlive-xfor-doc-2023.209.1.05svn15878-53.2.noarch.rpm"
RPM_HASH = "92f813f17462d6cb416774c5ffcb14b6aec9cfe860e4eaa009ecfc19b924b38b9201c002eaa3926e5b7c9ac180d135f081cf682f95134c5f0c00bdcbeb8793da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfor-doc"

RDEPENDS:${PN} += ""

inherit rpm
