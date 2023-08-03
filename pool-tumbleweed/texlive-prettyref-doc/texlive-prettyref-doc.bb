SUMMARY = "Documentation for texlive-prettyref"
DESCRIPTION = "This package includes the documentation for texlive-prettyref"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.3.0svn15878"

RPM_NAME = "texlive-prettyref-doc-2023.209.3.0svn15878-53.1.noarch.rpm"
RPM_HASH = "5ba2f101c66e0b63942602f85380b7995d5e3ffbdf7118197654de2ae82aa4e1bac65457d8bff8a3dad19f6755519504dedd8abc8387c0712ebaefae9c65680c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prettyref-doc"

RDEPENDS:${PN} += ""

inherit rpm
