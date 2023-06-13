SUMMARY = "Documentation for texlive-lt3rawobjects"
DESCRIPTION = "This package includes the documentation for texlive-lt3rawobjects"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.2svn65230"

RPM_NAME = "texlive-lt3rawobjects-doc-2023.201.2.2svn65230-52.1.noarch.rpm"
RPM_HASH = "d7c57a529bf792ccea937490efc95f1bccaf48ef334237d65c59e682b3649f250cb296b01f30942a623ef43b1f61c2d71b33f1537bd95acfc3bb61afa2752157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lt3rawobjects-doc"

RDEPENDS:${PN} += ""

inherit rpm
