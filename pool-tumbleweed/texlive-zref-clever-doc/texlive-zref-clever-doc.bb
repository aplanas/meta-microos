SUMMARY = "Documentation for texlive-zref-clever"
DESCRIPTION = "This package includes the documentation for texlive-zref-clever"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.6svn66021"

RPM_NAME = "texlive-zref-clever-doc-2023.201.0.0.3.6svn66021-52.2.noarch.rpm"
RPM_HASH = "0d4d4c0473cf6310d66d89df45bc60de88c27ba8c9fae81b498a681d491a7a856c4801539fd3eece80ca16aaf4ec58a18b17ca8cf1cd3ce3d6e3d3e0bb2001f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-clever-doc"

RDEPENDS:${PN} += ""

inherit rpm
