SUMMARY = "Documentation for texlive-handin"
DESCRIPTION = "This package includes the documentation for texlive-handin"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn48255"

RPM_NAME = "texlive-handin-doc-2023.209.0.0.1.1svn48255-54.1.noarch.rpm"
RPM_HASH = "8d5cd2a8658c94a779d517ca6d33862ee55e7b56a60cfaedebffab9ac55edb1befc97fed14b003f9defa3258eb5607029e112fae3b12aacc5e0f783cbd38f9a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handin-doc"

RDEPENDS:${PN} += ""

inherit rpm
