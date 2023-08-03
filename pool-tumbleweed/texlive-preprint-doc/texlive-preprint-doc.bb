SUMMARY = "Documentation for texlive-preprint"
DESCRIPTION = "This package includes the documentation for texlive-preprint"
LICENSE = "LPPL-1.0"

PV = "2023.209.2011svn30447"

RPM_NAME = "texlive-preprint-doc-2023.209.2011svn30447-53.1.noarch.rpm"
RPM_HASH = "663327b00008b846afb30a9184e74ffa5c46ade25f0e5c043e45041ab0fa53a1a8031921836fe2d5327c80ec76694bf88d7bd079983a601f9567967b900c4ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-preprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
