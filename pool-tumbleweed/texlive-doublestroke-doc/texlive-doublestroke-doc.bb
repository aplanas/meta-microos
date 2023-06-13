SUMMARY = "Documentation for texlive-doublestroke"
DESCRIPTION = "This package includes the documentation for texlive-doublestroke"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.111svn15878"

RPM_NAME = "texlive-doublestroke-doc-2023.201.1.111svn15878-52.1.noarch.rpm"
RPM_HASH = "5f22367778446656192b482257b141237a0c53615062cd4f23ae37e1c7c392a03dcd53ed158f28a62b887939a5209a3dbb90052b8b95f5b9de6f3f7824286bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doublestroke-doc"

RDEPENDS:${PN} += ""

inherit rpm
