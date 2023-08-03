SUMMARY = "Documentation for texlive-showdim"
DESCRIPTION = "This package includes the documentation for texlive-showdim"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn28918"

RPM_NAME = "texlive-showdim-doc-2023.209.1.2svn28918-54.1.noarch.rpm"
RPM_HASH = "12ac733701b4f0c96de37b60582bbe523a23dfd1b08462fa35d896920b9b8c11690a25fda2513bd66b0a3d60314e96f241035534482c217411385bcd96326d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showdim-doc"

RDEPENDS:${PN} += ""

inherit rpm
