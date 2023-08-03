SUMMARY = "Documentation for texlive-mindflow"
DESCRIPTION = "This package includes the documentation for texlive-mindflow"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65236"

RPM_NAME = "texlive-mindflow-doc-2023.209.svn65236-55.1.noarch.rpm"
RPM_HASH = "3004d8a952544921488cca568dc1ef6f8a4ffa5ff202f7ea1061a9416e88dd406f99c905aca6acf0ccddcf14252d14fd0d3ecfa53ea5ddc2ece0dacf88191313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mindflow-doc"

RDEPENDS:${PN} += ""

inherit rpm
