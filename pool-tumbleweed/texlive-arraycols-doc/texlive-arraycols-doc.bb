SUMMARY = "Documentation for texlive-arraycols"
DESCRIPTION = "This package includes the documentation for texlive-arraycols"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61719"

RPM_NAME = "texlive-arraycols-doc-2023.209.1.2svn61719-54.1.noarch.rpm"
RPM_HASH = "bb86fdf20141d0863a4e35dbb8a6f9ad63852432201b525d3f6af14616c1e40d07d0102fc16e543c2c659c8a8824a859258068bb5efe77a3f0c3a229151afded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arraycols-doc"

RDEPENDS:${PN} += ""

inherit rpm
