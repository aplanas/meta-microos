SUMMARY = "Documentation for texlive-glossaries"
DESCRIPTION = "This package includes the documentation for texlive-glossaries"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.52svn64919"

RPM_NAME = "texlive-glossaries-doc-2023.209.4.52svn64919-54.2.noarch.rpm"
RPM_HASH = "61e13d1d73e1a6a3f612f6405c4309b07e69b45ea1ebf2673da084e85d12fae5163d8588b0892a9c5d3590fa14fb5398f554b66358a0fc79950c27c3c6e48bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-makeglossaries-lite.1 \
man-makeglossaries.1 \
texlive-glossaries-doc"

RDEPENDS:${PN} += ""

inherit rpm
