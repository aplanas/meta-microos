SUMMARY = "Documentation for texlive-spotcolor"
DESCRIPTION = "This package includes the documentation for texlive-spotcolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-spotcolor-doc-2023.201.1.2svn15878-57.1.noarch.rpm"
RPM_HASH = "0de33a16c88f9d9ec8fe7519b4fcc29c937cffbadc7f7cf9e3f8fa8a9c40e67910d5b1b1d8199d82d6ea348bdf0644052415c707eaea6492d2a6b1e9ec396a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spotcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
