SUMMARY = "Documentation for texlive-albatross"
DESCRIPTION = "This package includes the documentation for texlive-albatross"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.5.0svn65647"

RPM_NAME = "texlive-albatross-doc-2023.201.0.0.5.0svn65647-54.1.noarch.rpm"
RPM_HASH = "a1f9f1d7093266a59bd5e291d1aad1dc2b75b9cc74cfdd87bbb37a0678678705ef087a07e9e90d30e2fbcbf823d6c63af2e431c5512f0ac8848829bfdc4f3af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-albatross.1 \
texlive-albatross-doc"

RDEPENDS:${PN} += ""

inherit rpm
