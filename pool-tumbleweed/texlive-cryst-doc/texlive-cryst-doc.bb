SUMMARY = "Documentation for texlive-cryst"
DESCRIPTION = "This package includes the documentation for texlive-cryst"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-cryst-doc-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "6f8e8b6c0f7babb1941cb11765eaa5994158e70ac3c48457db4dc6086ee92a30a8888d894a484a20265a049d188b30991c1d44b4f70052be721c77e2b88b7e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cryst-doc-de \
texlive-cryst-doc"

RDEPENDS:${PN} += ""

inherit rpm
