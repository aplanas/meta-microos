SUMMARY = "Documentation for texlive-allrunes"
DESCRIPTION = "This package includes the documentation for texlive-allrunes"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.1svn42221"

RPM_NAME = "texlive-allrunes-doc-2023.209.2.1.1svn42221-55.1.noarch.rpm"
RPM_HASH = "de9a033de2ffb8256433c995a962fc182cd04b5230ffe05bcb087362f222260f612af16245de740d5b4e776773b42070a6a1600b69c088cd5ba7e5570f8a78d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-allrunes-doc"

RDEPENDS:${PN} += ""

inherit rpm
