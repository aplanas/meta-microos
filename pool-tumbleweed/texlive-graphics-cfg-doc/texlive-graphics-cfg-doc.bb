SUMMARY = "Documentation for texlive-graphics-cfg"
DESCRIPTION = "This package includes the documentation for texlive-graphics-cfg"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn41448"

RPM_NAME = "texlive-graphics-cfg-doc-2023.201.svn41448-53.2.noarch.rpm"
RPM_HASH = "59d720a1840e7ea1238c9aff3327d6b001af7280a1b3e9d634c0fb8a160d0a380ae9615540329c33c7294fc5ffa4d32fd994d4f9f998ad493eba7c81768983ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-cfg-doc"

RDEPENDS:${PN} += ""

inherit rpm
