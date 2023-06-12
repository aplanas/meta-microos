SUMMARY = "Documentation for texlive-zebra-goodies"
DESCRIPTION = "This package includes the documentation for texlive-zebra-goodies"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.0svn51554"

RPM_NAME = "texlive-zebra-goodies-doc-2023.201.0.0.8.0svn51554-52.1.noarch.rpm"
RPM_HASH = "8cfb0512a6b35130d467f0984829447767450a7e47ab70bfc3a17d4c1760ced2da186182b4888a601e0279f5fd7b2df25e245853b7e363c89957734cad42e3e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zebra-goodies-doc"
RDEPENDS:${PN} += ""

inherit rpm
