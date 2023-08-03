SUMMARY = "Documentation for texlive-zootaxa-bst"
DESCRIPTION = "This package includes the documentation for texlive-zootaxa-bst"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn50619"

RPM_NAME = "texlive-zootaxa-bst-doc-2023.209.1.0svn50619-53.1.noarch.rpm"
RPM_HASH = "8c9d5386289f392d605ae212bae1c772dc3296f9847cb96ce67a097873de4b6d11db09ae388bedda834411e6627cae6a283e15ac79f14f449576a80823081782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zootaxa-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
