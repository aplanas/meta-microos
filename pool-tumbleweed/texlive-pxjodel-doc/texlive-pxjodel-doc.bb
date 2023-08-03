SUMMARY = "Documentation for texlive-pxjodel"
DESCRIPTION = "This package includes the documentation for texlive-pxjodel"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn64072"

RPM_NAME = "texlive-pxjodel-doc-2023.209.0.0.3svn64072-54.1.noarch.rpm"
RPM_HASH = "c1025923927ec96057498fbed2eb5e65137c1cd00191a7dae3f658486061160c6be9a8dc146fc149f09a10b31890045a04b4ac23003af599857a731e182613bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxjodel-doc"

RDEPENDS:${PN} += ""

inherit rpm
