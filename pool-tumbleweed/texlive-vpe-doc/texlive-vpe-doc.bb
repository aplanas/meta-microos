SUMMARY = "Documentation for texlive-vpe"
DESCRIPTION = "This package includes the documentation for texlive-vpe"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn26039"

RPM_NAME = "texlive-vpe-doc-2023.201.0.0.2svn26039-53.1.noarch.rpm"
RPM_HASH = "a9e58aed6c82a0af31401329af6f250fd41e177f53cf81b4974f9433d3b5cdb1e4661c6c91077f8b3e54b11d2b243cbbda3cfa02c9cf01aaae6013b7eeafd11e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vpe-doc"

RDEPENDS:${PN} += ""

inherit rpm
