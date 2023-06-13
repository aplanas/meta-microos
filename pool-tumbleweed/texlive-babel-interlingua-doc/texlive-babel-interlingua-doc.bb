SUMMARY = "Documentation for texlive-babel-interlingua"
DESCRIPTION = "This package includes the documentation for texlive-babel-interlingua"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn30276"

RPM_NAME = "texlive-babel-interlingua-doc-2023.201.1.6svn30276-53.1.noarch.rpm"
RPM_HASH = "a90e873cf0b10008864c99585ce80bda645294c253a415ee9cd50cec811020c20cd7a200890ae2e3050654352ce7d6252c75a5eb44244cd1e6759348a15d8461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-interlingua-doc"

RDEPENDS:${PN} += ""

inherit rpm
