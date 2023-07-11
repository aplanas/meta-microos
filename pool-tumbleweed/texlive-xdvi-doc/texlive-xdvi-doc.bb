SUMMARY = "Documentation for texlive-xdvi"
DESCRIPTION = "This package includes the documentation for texlive-xdvi"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62387"

RPM_NAME = "texlive-xdvi-doc-2023.201.svn62387-52.2.noarch.rpm"
RPM_HASH = "87fe5c12c8b326107ad88a1e753bafd5436d6a6fe6a762e6081fe8bc470f039776f11ff2207e0e53b47efcecd8602cddef9fa33789005fbe3199a28e2026940e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xdvi.1 \
texlive-xdvi-doc"

RDEPENDS:${PN} += ""

inherit rpm
