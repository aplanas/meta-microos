SUMMARY = "Documentation for texlive-tocvsec2"
DESCRIPTION = "This package includes the documentation for texlive-tocvsec2"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn33146"

RPM_NAME = "texlive-tocvsec2-doc-2023.209.1.3asvn33146-53.1.noarch.rpm"
RPM_HASH = "87cb09b73acbc13f7f9c7fbf1e8ea12ee06db98262452bed9378e479aba9ac60553b492f13e10ada583dfd2b895b3dec1f2316fde32b4ea14f5a9df3f4059aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocvsec2-doc"

RDEPENDS:${PN} += ""

inherit rpm
