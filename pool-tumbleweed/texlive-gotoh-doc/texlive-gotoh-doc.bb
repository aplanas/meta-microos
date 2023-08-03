SUMMARY = "Documentation for texlive-gotoh"
DESCRIPTION = "This package includes the documentation for texlive-gotoh"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44764"

RPM_NAME = "texlive-gotoh-doc-2023.209.1.1svn44764-54.1.noarch.rpm"
RPM_HASH = "a92ab4dc61bd2a0e468daab23058b6409a08e80646c1e0adab450c598cae370da687c2c68e3d0010c2109e408d9f785eb32b4c96dc06113d1e5b442f52e59d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gotoh-doc"

RDEPENDS:${PN} += ""

inherit rpm
