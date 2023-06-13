SUMMARY = "Documentation for texlive-biblatex2bibitem"
DESCRIPTION = "This package includes the documentation for texlive-biblatex2bibitem"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.2svn61648"

RPM_NAME = "texlive-biblatex2bibitem-doc-2023.201.0.0.2.2svn61648-53.1.noarch.rpm"
RPM_HASH = "9f4225df528fb2ed4a1a0e3c5d1b350b57cf7f528316bf4444d0e7c90850058ef66527e7aeb48b0cf6a9bf8436784c7a4c276f8b2bd52b7839419b61b85f3fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex2bibitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
