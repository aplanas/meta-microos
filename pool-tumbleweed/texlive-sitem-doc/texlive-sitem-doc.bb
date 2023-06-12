SUMMARY = "Documentation for texlive-sitem"
DESCRIPTION = "This package includes the documentation for texlive-sitem"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn22136"

RPM_NAME = "texlive-sitem-doc-2023.201.1.0svn22136-57.1.noarch.rpm"
RPM_HASH = "3ce870d6c736e33877f67327cb75b72bc32cce1654b11fcaf700e04e20b2170cf6eb77624b9daaf6a3a6058e48158f573c1185986d74177070db6737dec90e3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sitem-doc"
RDEPENDS:${PN} += ""

inherit rpm
