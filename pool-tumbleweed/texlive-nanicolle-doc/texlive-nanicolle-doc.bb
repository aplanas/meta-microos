SUMMARY = "Documentation for texlive-nanicolle"
DESCRIPTION = "This package includes the documentation for texlive-nanicolle"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.03ysvn56224"

RPM_NAME = "texlive-nanicolle-doc-2023.209.2.03ysvn56224-55.1.noarch.rpm"
RPM_HASH = "2c629b72141819ef2f1e80350f1f0aa0651fd0c6f2c1f2430b12994799452ad902277bcea22f8f998997ee7b157d06ece0e50d71746e25b6dd9f024f2652848d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nanicolle-doc-zh \
texlive-nanicolle-doc"

RDEPENDS:${PN} += ""

inherit rpm
