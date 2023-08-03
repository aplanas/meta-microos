SUMMARY = "Documentation for texlive-seu-ml-assign"
DESCRIPTION = "This package includes the documentation for texlive-seu-ml-assign"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn62933"

RPM_NAME = "texlive-seu-ml-assign-doc-2023.209.1.1svn62933-54.1.noarch.rpm"
RPM_HASH = "9cfcc3aea4c3826751a8537910cb6022c0c05609d4436e1a316b8fe33be0e9d18bcbb78c6023d894f0799e7e77eb08d0b075bebfc3ba024eaa15b9ee5544bb7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seu-ml-assign-doc"

RDEPENDS:${PN} += ""

inherit rpm
