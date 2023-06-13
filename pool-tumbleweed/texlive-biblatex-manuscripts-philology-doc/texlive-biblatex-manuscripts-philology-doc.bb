SUMMARY = "Documentation for texlive-biblatex-manuscripts-philology"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-manuscripts-philology"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.2svn53344"

RPM_NAME = "texlive-biblatex-manuscripts-philology-doc-2023.201.2.1.2svn53344-53.1.noarch.rpm"
RPM_HASH = "c6accec406c190d712990a8e15365af53c6b05efe7daea9fcd9902d7e693d8ba6645fd668c4759049bf358d3426b1a9722eda21f422d1630b0b4e1d229db1c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-manuscripts-philology-doc"

RDEPENDS:${PN} += ""

inherit rpm
