SUMMARY = "Documentation for texlive-pst-ovl"
DESCRIPTION = "This package includes the documentation for texlive-pst-ovl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.07bsvn54963"

RPM_NAME = "texlive-pst-ovl-doc-2023.201.0.0.07bsvn54963-52.1.noarch.rpm"
RPM_HASH = "2f273848051c2427dac581ff1c2614dde3ec6449de6be59478ef11cf158ef86e97d136d1946952d3579d0a7a6a4c16312fcda542f7802e5a6dc8d687cb1077c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-ovl-doc"

RDEPENDS:${PN} += ""

inherit rpm
