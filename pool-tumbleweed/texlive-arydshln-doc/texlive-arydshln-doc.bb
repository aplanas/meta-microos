SUMMARY = "Documentation for texlive-arydshln"
DESCRIPTION = "This package includes the documentation for texlive-arydshln"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.76svn50084"

RPM_NAME = "texlive-arydshln-doc-2023.209.1.76svn50084-54.1.noarch.rpm"
RPM_HASH = "0d3aa5d31accf487d4bc715c2d3ceb8460babf5ad6ea1a30113de5bedc2a3127a89f0bed8c8bdd2aff7b23885e0f91dceea149c79d0dc225e49706c1630d5cf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arydshln-doc"

RDEPENDS:${PN} += ""

inherit rpm
