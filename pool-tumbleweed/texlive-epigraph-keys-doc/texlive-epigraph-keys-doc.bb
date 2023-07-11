SUMMARY = "Documentation for texlive-epigraph-keys"
DESCRIPTION = "This package includes the documentation for texlive-epigraph-keys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-epigraph-keys-doc-2023.201.1.0svn61719-53.2.noarch.rpm"
RPM_HASH = "71023393dd179d5ba30511319cd71bb004d18814b59efab0e919bbcbe9fab947c2a6f5d809035fc00b6d3689afce11844bb38fa1a336cf2ff4e1c8391b2afd19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigraph-keys-doc"

RDEPENDS:${PN} += ""

inherit rpm
