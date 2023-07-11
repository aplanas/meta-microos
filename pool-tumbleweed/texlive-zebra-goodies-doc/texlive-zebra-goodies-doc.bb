SUMMARY = "Documentation for texlive-zebra-goodies"
DESCRIPTION = "This package includes the documentation for texlive-zebra-goodies"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.0svn51554"

RPM_NAME = "texlive-zebra-goodies-doc-2023.201.0.0.8.0svn51554-52.2.noarch.rpm"
RPM_HASH = "1c14c5bd0820b68c50a315000c19661220b8f29e93e6c9eef7e245475e812181fa010c780e76a017912959aca3baf617a5b383560872fcf668bf505427df71bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zebra-goodies-doc"

RDEPENDS:${PN} += ""

inherit rpm
