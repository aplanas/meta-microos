SUMMARY = "Documentation for texlive-tikz-trackschematic"
DESCRIPTION = "This package includes the documentation for texlive-tikz-trackschematic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.1svn63480"

RPM_NAME = "texlive-tikz-trackschematic-doc-2023.209.0.0.7.1svn63480-53.1.noarch.rpm"
RPM_HASH = "a719e492c96e69a60006d0621788b3cf1c70a98920731e157b96a8b6c27a7b556a37a82d009f143b1b108ee817c4183173f1fc81b27992274e81790e4f2b477e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-trackschematic-doc"

RDEPENDS:${PN} += ""

inherit rpm
