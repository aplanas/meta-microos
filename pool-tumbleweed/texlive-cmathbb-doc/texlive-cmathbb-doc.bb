SUMMARY = "Documentation for texlive-cmathbb"
DESCRIPTION = "This package includes the documentation for texlive-cmathbb"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56414"

RPM_NAME = "texlive-cmathbb-doc-2023.209.1.0svn56414-54.1.noarch.rpm"
RPM_HASH = "f19dea54c1e266b496508db7cc6c4412a151ddc5882a05f21967fcf53fece095ce627fd959c848323a91b6c3cf22edd958c7fedb7b5e0c03602fa0929087205f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmathbb-doc"

RDEPENDS:${PN} += ""

inherit rpm
