SUMMARY = "Documentation for texlive-pict2e"
DESCRIPTION = "This package includes the documentation for texlive-pict2e"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4bsvn56504"

RPM_NAME = "texlive-pict2e-doc-2023.209.0.0.4bsvn56504-52.1.noarch.rpm"
RPM_HASH = "f1194664a9a0b2122db7e7f7c9dd8d2ce04c8362d427da3bcb5d099a975d04b4ad88d733af73be51b4b28af8a2fe880c9340403d7bf8c8c5054a0fccaac18eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pict2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
