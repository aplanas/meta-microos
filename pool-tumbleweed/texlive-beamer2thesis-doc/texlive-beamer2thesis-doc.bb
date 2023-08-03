SUMMARY = "Documentation for texlive-beamer2thesis"
DESCRIPTION = "This package includes the documentation for texlive-beamer2thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn27539"

RPM_NAME = "texlive-beamer2thesis-doc-2023.209.2.2svn27539-54.1.noarch.rpm"
RPM_HASH = "207f560d3064d433f117ced8a049759e0718b35466212e4fe5d33b1882ec2d7e78420f25a9552d4f81068dca35929286d5ec5732e6011a6eb0b5c5e1e43845ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-beamer2thesis-doc-en;it \
texlive-beamer2thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
