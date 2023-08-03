SUMMARY = "Documentation for texlive-hfutthesis"
DESCRIPTION = "This package includes the documentation for texlive-hfutthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.4svn64025"

RPM_NAME = "texlive-hfutthesis-doc-2023.209.1.0.4svn64025-54.1.noarch.rpm"
RPM_HASH = "379dfb63b18a3fc67da424ac3bc5202d64d9cc74dbaff7ced0faf4e2da0c0e6373f2059b7f20bea0c7589cc6536fb5903edcb57da17c35c7d031c1cefd9c7365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hfutthesis-doc-zh \
texlive-hfutthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
