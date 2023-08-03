SUMMARY = "Documentation for texlive-langsci-avm"
DESCRIPTION = "This package includes the documentation for texlive-langsci-avm"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn66016"

RPM_NAME = "texlive-langsci-avm-doc-2023.209.0.0.3.0svn66016-56.1.noarch.rpm"
RPM_HASH = "06923fec6f1999c13679ac3d1e9642654c48f3c7d25aa6e7889ce0e5e16c186775bfa9cb14560367a49158a0c5402047f1dee895c1139ece8ee15188c1e0be07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langsci-avm-doc"

RDEPENDS:${PN} += ""

inherit rpm
