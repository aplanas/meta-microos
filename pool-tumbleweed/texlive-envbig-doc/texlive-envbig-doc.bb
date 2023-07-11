SUMMARY = "Documentation for texlive-envbig"
DESCRIPTION = "This package includes the documentation for texlive-envbig"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-envbig-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "8278ad5cd7e6f50741f446e888999f47a2fc501d5adcbecf0904d26c9585940d3e21d80ebce04b830e3edf1b9e9628619f9685702244a7f33004b73f66957423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envbig-doc"

RDEPENDS:${PN} += ""

inherit rpm
