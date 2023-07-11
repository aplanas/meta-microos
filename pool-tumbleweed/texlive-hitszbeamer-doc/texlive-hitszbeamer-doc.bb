SUMMARY = "Documentation for texlive-hitszbeamer"
DESCRIPTION = "This package includes the documentation for texlive-hitszbeamer"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn54381"

RPM_NAME = "texlive-hitszbeamer-doc-2023.201.1.0.0svn54381-53.2.noarch.rpm"
RPM_HASH = "85cc9e976d337f0db9e868d5424abe24781ba98bc22b593e3c76466f95ea26ad23881c1209a82e6d4b85732eed29ab83db83bcb7ef3bf07c7d78496345fa3c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitszbeamer-doc-zh \
texlive-hitszbeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
