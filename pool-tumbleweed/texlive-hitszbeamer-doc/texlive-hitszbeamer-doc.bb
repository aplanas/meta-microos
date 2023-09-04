SUMMARY = "Documentation for texlive-hitszbeamer"
DESCRIPTION = "This package includes the documentation for texlive-hitszbeamer"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn54381"

RPM_NAME = "texlive-hitszbeamer-doc-2023.209.1.0.0svn54381-54.2.noarch.rpm"
RPM_HASH = "9f82a771b9383bbbf4ce9aca5d71dad5d0ff9e1de7aed04023794d645ee746299ef408e009f0dd4b1495dfd9d2ab59f0104cc86736093a2559496b3c0dfc6590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitszbeamer-doc-zh \
texlive-hitszbeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
