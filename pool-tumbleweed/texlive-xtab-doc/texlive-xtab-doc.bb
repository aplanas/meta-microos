SUMMARY = "Documentation for texlive-xtab"
DESCRIPTION = "This package includes the documentation for texlive-xtab"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3fsvn23347"

RPM_NAME = "texlive-xtab-doc-2023.201.2.3fsvn23347-52.1.noarch.rpm"
RPM_HASH = "97d33dbca02637a64696741f24c1797950a117e4a811a7de71d362695c27d854965ec9e2547d0aed5308d597bb9a002bf1c680d6f49648523afe4534405e2ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xtab-doc"
RDEPENDS:${PN} += ""

inherit rpm
