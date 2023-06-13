SUMMARY = "Documentation for texlive-shapepar"
DESCRIPTION = "This package includes the documentation for texlive-shapepar"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn30708"

RPM_NAME = "texlive-shapepar-doc-2023.201.2.2svn30708-53.1.noarch.rpm"
RPM_HASH = "e1d01dc4f4c7657f71ea29e5e8922e01993c8ede18e250dfdc8a788a17a61938cfc263a1c11b028f8a1bc99504fef1f996e38a1668d5ab87b4652dad087e8bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shapepar-doc"

RDEPENDS:${PN} += ""

inherit rpm
