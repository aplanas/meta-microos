SUMMARY = "Documentation for texlive-metalogo"
DESCRIPTION = "This package includes the documentation for texlive-metalogo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12svn18611"

RPM_NAME = "texlive-metalogo-doc-2023.201.0.0.12svn18611-54.1.noarch.rpm"
RPM_HASH = "26ccdc8f3a8fd478fee21a7b43bc36070d8a41ac91ec790a69079749e21df3f4191994aa3384459e2e281f6f9394bd8a4feef43620d9923164306f176e26c468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metalogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
