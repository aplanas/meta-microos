SUMMARY = "Documentation for texlive-nuc"
DESCRIPTION = "This package includes the documentation for texlive-nuc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn22256"

RPM_NAME = "texlive-nuc-doc-2023.209.0.0.1svn22256-55.1.noarch.rpm"
RPM_HASH = "6da483ab98fec80fd8f44c6166170220b2ec7fa4afc75a52de5b694ada5fb9debbecb6f5d2658088528402b102bf6f9717a93d357e3d0a8940a002366270d998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nuc-doc"

RDEPENDS:${PN} += ""

inherit rpm
