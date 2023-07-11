SUMMARY = "Documentation for texlive-emisa"
DESCRIPTION = "This package includes the documentation for texlive-emisa"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.0svn60068"

RPM_NAME = "texlive-emisa-doc-2023.201.2.3.0svn60068-53.2.noarch.rpm"
RPM_HASH = "0bdc63e1a0a577f59fc3f3238747bdeba02896a5df859446d273d659367843dcfcc78187b9fb6814f1bc44b63c7810eb0e8bc8ff88ec257524edb2192399c940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emisa-doc"

RDEPENDS:${PN} += ""

inherit rpm
