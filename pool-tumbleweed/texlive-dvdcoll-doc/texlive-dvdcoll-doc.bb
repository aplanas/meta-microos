SUMMARY = "Documentation for texlive-dvdcoll"
DESCRIPTION = "This package includes the documentation for texlive-dvdcoll"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-dvdcoll-doc-2023.201.1.1asvn15878-53.2.noarch.rpm"
RPM_HASH = "3d6662854e2e3e1e373affee12c32a16b74db6319293762e42f262cee790cf23f77d06a1143ab30d3e9e13136c5ececae395ccfc667d3090f287b0939f6ba1b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dvdcoll-doc-en;de \
texlive-dvdcoll-doc"

RDEPENDS:${PN} += ""

inherit rpm
