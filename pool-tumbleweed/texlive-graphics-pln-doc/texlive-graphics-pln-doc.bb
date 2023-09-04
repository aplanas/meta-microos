SUMMARY = "Documentation for texlive-graphics-pln"
DESCRIPTION = "This package includes the documentation for texlive-graphics-pln"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65187"

RPM_NAME = "texlive-graphics-pln-doc-2023.209.svn65187-54.2.noarch.rpm"
RPM_HASH = "bf400bc1bd568c667ff065c19a1015501eb30789155cda35aa0cbbd2ef472de4eaade13432a64f2eeb3600c6b21f5e3d45c66a043372718f942a504941e47323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-pln-doc"

RDEPENDS:${PN} += ""

inherit rpm
