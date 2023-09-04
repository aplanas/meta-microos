SUMMARY = "Documentation for texlive-hlist"
DESCRIPTION = "This package includes the documentation for texlive-hlist"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn44983"

RPM_NAME = "texlive-hlist-doc-2023.209.0.0.11svn44983-54.2.noarch.rpm"
RPM_HASH = "13c729864dc58c9c67015de674f640f8192886174ac429e2362395151bd6390cfe1aa963f48ef1b22d1948c1809e257e214875c2c7cce5bce08f03ca0e75e2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
