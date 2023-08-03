SUMMARY = "Documentation for texlive-colorist"
DESCRIPTION = "This package includes the documentation for texlive-colorist"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66434"

RPM_NAME = "texlive-colorist-doc-2023.209.svn66434-54.1.noarch.rpm"
RPM_HASH = "e6404f92185bdc5bb6525325aa5bf64e7a44cb169c2ffc33510bf2875ecb11471a6f03615bc97cc5cc92db1ebeab60eab65810a33a298e095acd8682da0982b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorist-doc"

RDEPENDS:${PN} += ""

inherit rpm
